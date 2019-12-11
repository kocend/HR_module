package com.hrmodule.model;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "urlopy")
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_urlopu")
    private Integer id;

    @Column(name = "poczatek")
    private Date startDate;

    @Column(name = "koniec")
    private Date endDate;

    @Column(name = "powod")
    private String reason;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
