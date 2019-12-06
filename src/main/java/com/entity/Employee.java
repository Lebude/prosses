package com.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "name", length = 20)
    @NotBlank(message = "Please enter FirstName:")
    private String name;

    @Column(name = "surname", length = 25)
    @NotBlank(message = "Please enter LastName:")
    private String surname;

    @Column(name = "salary")
    private double salary;

    @NotBlank(message = "Please enter email address:")
    private String email;

    @Column(name = "contact_number")
    @NotBlank(message = "Please enter ContactNumber:")
    private String contactNumber;


    public Employee() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
