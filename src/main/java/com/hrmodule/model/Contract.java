package com.hrmodule.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "umowy")
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_umowy")
    private Integer id;

    @Column(name = "data_zawarcia")
    private Date employmentDate;

    @Column(name = "wynagrodzenie_podstawowe")
    private double baseSalary;

    @Column(name = "wynagrodzenie_netto")
    private double netSalary;

    @Column(name = "id_rodzaj_umow")
    private Integer typeOfContractID;

    @Column(name = "id_pracownika")
    private Integer employeeID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public Integer getTypeOfContractID() {
        return typeOfContractID;
    }

    public void setTypeOfContractID(Integer typeOfContractID) {
        this.typeOfContractID = typeOfContractID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }
}
