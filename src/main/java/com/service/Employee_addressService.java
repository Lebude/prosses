package com.service;

import com.entity.Employee_address;

import java.util.List;

public interface Employee_addressService {
    Employee_address insert(Employee_address building);
    void delete(Employee_address building);
    void update(Employee_address building);
    List<Employee_address> getEmployee_addressByCity(String city);
}
