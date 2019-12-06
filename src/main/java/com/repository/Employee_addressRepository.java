package com.repository;
import com.entity.Employee_address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface Employee_addressRepository  {
    Employee_address save(Employee_address employee_address);
    void delete(Employee_address employee_address);
    List<Employee_address> findEmployee_addressByCity(String city);
}
