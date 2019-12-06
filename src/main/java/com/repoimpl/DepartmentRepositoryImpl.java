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
        entityManager.createQuery("Save from Department d where d.department=:department").setParameter("department" ,department)
                .executeUpdate();
        System.out.println("SUCCESS");
        return department;
    }

    @Override
    public void delete(Long id) {
        entityManager.createQuery("delete from Department d where d.id=:id").setParameter("id",id)
                .executeUpdate();
        System.out.println("SUCCESS");
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
