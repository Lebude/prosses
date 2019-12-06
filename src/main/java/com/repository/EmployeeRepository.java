package com.repository;
import com.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository {
    Employee save(Employee employee);
    void delete(Employee employee);
    Employee findEmployeeById(Long employeeId);
    List<Employee> findByEmployees();
    List<Employee> findByEmployeeBySalary(int minSalary, int maxSalary);
}
