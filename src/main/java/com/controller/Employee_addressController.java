package com.controller;

import com.entity.Employee_address;
import com.service.Employee_addressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/employee_address")
public class Employee_addressController {

    @Autowired
    Employee_addressService employee_addressService;


    @PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee_address> insert(@RequestBody @Valid Employee_address employee_address) {
        employee_addressService.insert(employee_address);
        return new ResponseEntity<>(employee_address, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(Employee_address employee_address) {
        employee_addressService.delete(employee_address);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee_address> update(@RequestBody @Valid Employee_address employee_address) {
        employee_addressService.update(employee_address);
        return new ResponseEntity<>(employee_address, HttpStatus.OK);
    }
    @RequestMapping(value = "/buildingFloors", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee_address> getEmployee_addressByCity(String city) {
        return (List<Employee_address>) employee_addressService.getEmployee_addressByCity(city);
    }

}
