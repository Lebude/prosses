package com.impl;

import com.entity.Employee_address;
import com.repository.Employee_addressRepository;
import com.service.Employee_addressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employee_addressServiceImpl implements Employee_addressService {

    @Autowired
    Employee_addressRepository employee_addressRepository;

    @Override
    public Employee_address insert(Employee_address employee_address) {
        return employee_addressRepository.save(employee_address);
    }

    @Override
    public void delete(Employee_address employee_address) {
        employee_addressRepository.delete(employee_address);

    }

    @Override
    public void update(Employee_address employee_address) {
        employee_addressRepository.save(employee_address);

    }

    @Override
    public List<Employee_address> getEmployee_addressByCity(String city) {
        return employee_addressRepository.findEmployee_addressByCity(city);
    }
}
