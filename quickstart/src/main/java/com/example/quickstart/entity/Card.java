package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by guocui on 2018/9/28.
 */
@Data
public class Card {
    private String author;
    private String avatar;
    private String picture;
    private String title;
    private String introduce;
    private Integer like;
    private Integer amount;

    public Card(String author, String avatar, String picture, String title, String introduce) {
        this.author = author;
        this.avatar = avatar;
        this.picture = picture;
        this.title = title;
        this.introduce = introduce;
    }

    public Card(String author, String avatar, String picture, String title, String introduce, Integer like, Integer amount) {
        this.author = author;
        this.avatar = avatar;
        this.picture = picture;
        this.title = title;
        this.introduce = introduce;
        this.like = like;
        this.amount = amount;
    }
}
