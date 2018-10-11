package com.example.quartz.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
public class Step {
    @GeneratedValue
    @Id
    private Integer id;
    private String account;
    private Date date;
    private String number;

    public Step() {
    }

    public Step(String account, Date date, String number) {
        this.account = account;
        this.date = date;
        this.number = number;
    }
}
