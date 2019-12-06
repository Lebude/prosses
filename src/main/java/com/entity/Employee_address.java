package com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Employee_Address")
public class Employee_address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_address_id")
    private Long id;

    @Column(name= "city")
    private String city;

    @Column(name = "address",length = 20)
    private String address;

    @Column(name ="postal_code", length = 25)
    private int postalCode;

    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Employee employeeId;

    @JoinColumn(name = "building_id", referencedColumnName = "building_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Building buildingId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public Building getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Building buildingId) {
        this.buildingId = buildingId;
    }
}
