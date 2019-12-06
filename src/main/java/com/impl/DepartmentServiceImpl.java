package com.impl;

import com.entity.Department;
import com.repository.DepartmentRepository;
import com.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department insert(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void delete(Long id) {
        departmentRepository.delete(id);

    }
    @Override
    public Department update(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findDepartmentById(id);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findDepartments();
    }

    @Override
    public List<Department> getDepartmentNames(String name) {
        return departmentRepository.findDepartmentNames(name);
    }

    @Override
    public Object findDepartmentById(Long id) {
        return null;
    }
}
