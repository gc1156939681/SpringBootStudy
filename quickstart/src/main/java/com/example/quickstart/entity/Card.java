package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by guocui on 2018/9/28.
 */
@Data
public class Card {
    private String avatar;
    private String name;
    private String time;
    private String title;
    private String content;
    private String picture;
    private Integer like;
    private Integer comment;

    public Card(String avatar, String name, String time, String title, String content, String picture, Integer like, Integer comment) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.title = title;
        this.content = content;
        this.picture = picture;
        this.like = like;
        this.comment = comment;
    }
}
