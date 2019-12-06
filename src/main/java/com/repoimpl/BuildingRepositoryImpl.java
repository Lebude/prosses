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
        entityManager.createQuery("Save from Position d where d.position=:position").setParameter("building" ,building)
            .executeUpdate();
        System.out.println("SUCCESS");
        return building;
    }

    @Override
    public void delete(Building building) {
        entityManager.createQuery("delete from Building d where d.building=:building").setParameter("building",building)
                .executeUpdate();
        System.out.println("SUCCESS");

    }

    @Override
    public List<Building> findBuildingByBuildingFloors(String floors) {
        return entityManager.createQuery("select d from Building where d.floors=:floors").setParameter("floors",floors).getResultList();
    }
}
