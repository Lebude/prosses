//package com.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class DepartmentExceptionController {
//    @ExceptionHandler(value = DepartmentNotfoundException.class)
//    public ResponseEntity<String>exception(DepartmentNotfoundException exception){
//        return new ResponseEntity<>("Department not found", HttpStatus.NOT_FOUND);
//    }
//}
