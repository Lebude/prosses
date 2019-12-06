package com.entity;

import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Building_design")
public class Building_design implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "building_designId")
    private int id;

    @Column(name = "design_process")
    private String design_process;

    @Column(name = "contractual")
    private String contractual;

    @Column(name="drawing")
    private String drawing;

    @Column(name = "component")
    private String component;

    @Column(name = "topologies")
    private String topologies;

    @Column(name = "designers")
    private String designers;

    @JoinColumn(name = "building_id", referencedColumnName = "building_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Building buildingId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesign_process() {
        return design_process;
    }

    public void setDesign_process(String design_process) {
        this.design_process = design_process;
    }

    public String getContractual() {
        return contractual;
    }

    public void setContractual(String contractual) {
        this.contractual = contractual;
    }

    public String getDrawing() {
        return drawing;
    }

    public void setDrawing(String drawing) {
        this.drawing = drawing;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getTopologies() {
        return topologies;
    }

    public void setTopologies(String topologies) {
        this.topologies = topologies;
    }

    public String getDesigners() {
        return designers;
    }

    public void setDesigners(String designers) {
        this.designers = designers;
    }

    public Building getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Building buildingId) {
        this.buildingId = buildingId;
    }
}
