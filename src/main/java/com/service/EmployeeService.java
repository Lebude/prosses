package com.service;

import com.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee insert(Employee employee);
    void delete(Employee employee);
    Employee update(Employee employee);
    Employee getEmployeeById(Long employeeId);
    List<Employee> getEmployees();
    List<Employee>getEmployeeBySalary(int minSalary, int maxSalary);
}
