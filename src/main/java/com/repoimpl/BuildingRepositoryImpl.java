package com.repoimpl;

import com.entity.Building;
import com.repository.BuildingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BuildingRepositoryImpl implements BuildingRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Building save(Building building) {
        entityManager.persist(building);
        return building;
    }

    @Override
    public void delete(Building building) {
        entityManager.remove(building);

    }

    @Override
    public List<Building> findBuildingByBuildingFloors(String floors) {
        return entityManager.createQuery("select d from Building where d.floors=:floors").setParameter("floors",floors).getResultList();
    }
}
