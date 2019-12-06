package com.repoimpl;

import com.entity.Department;
import com.repository.DepartmentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DepartmentRepositoryImpl implements DepartmentRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Department save(Department department) {
        entityManager.persist(department);
        return department;

    }

    @Override
    public void delete(Long id) {
        entityManager.remove(id);
    }

    @Override
    public List<Department> findDepartmentNames(String name) {
        return entityManager.createQuery("Select d from Department where d.name=:name")
                .setParameter("name",name)
                .getResultList();
    }

    @Override
    public List<Department> findDepartments() {
        Class<Object> persistentClass = null;
        return entityManager.createQuery("Select department from" + persistentClass.getSimpleName()+ "department").getResultList();
    }

    @Override
    public Department findDepartmentById(Long id) {
        return (Department) entityManager.createQuery("SELECT  d from Department where d.id=:id").setParameter("id",id).getResultList();
    }
}
