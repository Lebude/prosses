package com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contract")
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private int id;

    @Column(name = "security")
    private String security;

    @Column(name = "relation")
    private String relation;

    @JoinColumn(name = "manager_id", referencedColumnName = "manager_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Manager managerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Manager getManagerId() {
        return managerId;
    }

    public void setManagerId(Manager managerId) {
        this.managerId = managerId;
    }
}
