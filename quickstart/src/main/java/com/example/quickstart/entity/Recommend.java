package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by guocui on 2018/9/28.
 */
@Data
public class Recommend {
    private String pic;
    private String title;
    private String introduce;
    private String amount;

    public Recommend(String pic, String title, String introduce, String amount) {
        this.pic = pic;
        this.title = title;
        this.introduce = introduce;
        this.amount = amount;
    }
}
