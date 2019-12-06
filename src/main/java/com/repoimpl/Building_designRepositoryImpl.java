package com.repoimpl;

import com.entity.Building_design;
import com.repository.Building_designRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class Building_designRepositoryImpl implements Building_designRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Building_design building_design) {
        entityManager.persist(building_design);

    }

    @Override
    public void delete(int id) { entityManager.remove(id);

    }

    @Override
    public Building_design findBuilding_designByDesigners(String designers) {
        return null;
    }

    @Override
    public List<String> findBuilding_designByTopologies(String topologies) {
        return null;
    }

    @Override
    public List<String> findBuilding_designByComponent(String component) {
        return null;
    }
}
