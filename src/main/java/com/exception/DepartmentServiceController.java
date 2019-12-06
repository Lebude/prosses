//package com.exception;
//
//import com.entity.Department;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class DepartmentServiceController {
//    private static Map<String, Department> departmentRepo=new HashMap<>();
//
//
//    static{
//        Department first = new Department();
//        first.setDepartmentId("1");
//        first.setDepartmentName("IT");
//        departmentRepo.put(first.getDepartmentId("1"), first);
//
//        Department second=new Department();
//        second.setDepartmentId("1");
//        second.setDepartmentName("SMM");
//        departmentRepo.put(second.getDepartmentId("2"),second);
//
//        Department third=new Department();
//        third.setDepartmentId("1");
//        third.setDepartmentName("Engineer");
//        departmentRepo.put(third.getDepartmentId("3"),third);
//
//
//
//    }
//}
