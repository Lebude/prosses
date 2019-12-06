package com.service;

import com.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department insert(Department department);
    void delete(Long id);
    Department update(Department department);
    Department getDepartmentById(Long id);
    List<Department> getDepartments();
    List<Department> getDepartmentNames(String name);
    Object findDepartmentById(Long id);
}
