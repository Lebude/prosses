package com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "WareHouse")
public class WareHouse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WareHouse_id")
    private int id;

    @Column(name = "name")
    private String name;


    @JoinColumn(name = "employee_address_id", referencedColumnName = "employee_address_id")
    @OneToOne(fetch = FetchType.EAGER)
    private Employee_address employee_addressId;


    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee_address getEmployee_addressId() {
        return employee_addressId;
    }

    public void setEmployee_addressId(Employee_address employee_addressId) {
        this.employee_addressId = employee_addressId;
    }

  /*  public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }*/
}
