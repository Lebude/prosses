package com.controller;

import com.entity.Department;
import com.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/department_controller")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("departments")
    public List<Department> getDepartments() {
        return departmentService.getDepartments();
    }

    @RequestMapping("department_names")
    public List<Department> getDepartmentNames(String name) {
        return departmentService.getDepartmentNames(name);
    }

    @PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Department> insert(@RequestBody @Valid Department department) {
        departmentService.insert(department);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(Long id) {
        departmentService.delete(id);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Department> update(@RequestBody @Valid Department department) {
        departmentService.update(department);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @RequestMapping(value = "/department_id", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Department> getDepartmentById(@RequestBody @Valid Long id) {
        return (List<Department>) departmentService.findDepartmentById(id);


    }
}