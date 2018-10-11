package com.example.quartz.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class SportUser {
    @GeneratedValue
    @Id
    private Integer id;
    private String account;
    private String password;
    private String avatar;
    private String nickName;

    public SportUser() {
    }

    public SportUser(String account, String password, String avatar, String nickName) {
        this.account = account;
        this.password = password;
        this.avatar = avatar;
        this.nickName = nickName;
    }
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "sportUser_id")
    private List<Step> steps = new ArrayList<>();


    

    public SportUser(String account, String password, String avatar, String nickName, List<Step> steps) {
        this.account = account;
        this.password = password;
        this.avatar = avatar;
        this.nickName = nickName;
        this.steps = steps;
    }
}
