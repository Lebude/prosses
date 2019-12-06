package com.impl;

import com.entity.Employee;
import com.repository.EmployeeRepository;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee insert(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return   employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findEmployeeById(employeeId);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findByEmployees();
    }

    @Override
    public List<Employee> getEmployeeBySalary(int minSalary, int maxSalary) {
        return employeeRepository.findByEmployeeBySalary(minSalary, maxSalary);
    }
}
