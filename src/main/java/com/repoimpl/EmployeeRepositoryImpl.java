package com.repoimpl;

import com.entity.Employee;
import com.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Employee save(Employee employee) {
        entityManager.persist(employee);
        return employee;

    }

    @Override
    public void delete(Employee employee) {
        entityManager.remove(employee);

    }

    @Override
    public Employee findEmployeeById(Long employeeId) {
        return (Employee) entityManager.createQuery("select d from Employee where d.employeeId=:employeeId").setParameter("employeeId",employeeId).getResultList();
    }

    @Override
    public List<Employee> findByEmployees() {
        Class<Object> persistentClass = null;
        return entityManager.createQuery("Select Employee from" + persistentClass.getSimpleName()+ "employee").getResultList();
    }

    @Override
    public List<Employee> findByEmployeeBySalary(int minSalary, int maxSalary) {
        return entityManager.createQuery("select d from Employee where d.minSalary=:minSalary and d.maxSalary=:maxSalary")
                .setParameter("minSalary",minSalary).setParameter("maxSalary",maxSalary).getResultList();
    }
}
