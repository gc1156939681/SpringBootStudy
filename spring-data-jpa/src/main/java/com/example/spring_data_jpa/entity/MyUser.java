package com.example.spring_data_jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by guocui on 2018/9/28.
 */
@Entity
@Data
public class MyUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String userAvatar;
}
