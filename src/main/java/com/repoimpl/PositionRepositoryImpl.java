package com.repoimpl;

import com.entity.Position;
import com.repository.PositionRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PositionRepositoryImpl implements PositionRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<String> findPositionMinSalary(double minSalary) {
        List<String> position = entityManager.createQuery("Select d from Position d where d.position.minSalary=:minSalary")
                .setParameter("minSalary", minSalary)
                .getResultList();
        return position;
    }

    @Override
    public List<Position> findAllPosition() {
        Class<Object> persistentClass = null;
        return entityManager.createQuery("Select position from" + persistentClass.getSimpleName()+ "position").getResultList();
        
}

    @Override
    public void save(Position position) {
        entityManager.persist(position);

    }

    @Override
    public void delete(Position position) {
        entityManager.remove(position);


    }
}
