package com.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Building")
public class Building implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "building_id")
    private int id;

    @Column(name = "building_number")
    private Long buildingNumber;

    @Column(name = "building_address")
    private String buildingAddress;

    @Column(name = "building_floor")
    private String buildingFloor;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Long buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public String getBuildingFloor() {
        return buildingFloor;
    }

    public void setBuildingFloor(String buildingFloor) {
        this.buildingFloor = buildingFloor;
    }
}

