package com.repository;

import com.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DepartmentRepository  {
    Department save(Department department);
    void delete(Long id);
    List<Department> findDepartmentNames(String name);
    List<Department> findDepartments();
    Department findDepartmentById(Long id);
}
