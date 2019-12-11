package com.hrmodule.model;

import javax.persistence.*;

@Entity
@Table(name = "dzialy")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dzialu")
    private Integer id;

    @Column(name = "nazwa_dzialu")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
