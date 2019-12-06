package com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "manager")
public class Manager implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private int id;
    @Column(name = "director")
    private String director;
    @Column(name = "junior_director")
    private String juniorDirector;
    @Column(name = "senior_director")
    private String seniorDirector;
    @Column(name = "deputy")
    private String deputy;

    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    @OneToOne(fetch = FetchType.EAGER)
    private Department departmentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getJuniorDirector() {
        return juniorDirector;
    }

    public void setJuniorDirector(String juniorDirector) {
        this.juniorDirector = juniorDirector;
    }

    public String getSeniorDirector() {
        return seniorDirector;
    }

    public void setSeniorDirector(String seniorDirector) {
        this.seniorDirector = seniorDirector;
    }

    public String getDeputy() {
        return deputy;
    }

    public void setDeputy(String deputy) {
        this.deputy = deputy;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }
}
