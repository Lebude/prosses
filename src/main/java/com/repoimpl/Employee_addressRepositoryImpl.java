package com.repoimpl;

import com.entity.Employee_address;
import com.repository.Employee_addressRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class Employee_addressRepositoryImpl implements Employee_addressRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Employee_address save(Employee_address employee_address) {
        entityManager.persist(employee_address);
        return employee_address;
    }

    @Override
    public void delete(Employee_address employee_address) {
        entityManager.remove(employee_address);

    }

    @Override
    public List<Employee_address> findEmployee_addressByCity(String city) {
        return entityManager.createQuery("select d from Employee_address d.city=:city")
                .setParameter("city", city)
                .getResultList();
    }

}
