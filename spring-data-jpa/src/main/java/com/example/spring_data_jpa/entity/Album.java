package com.example.spring_data_jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by guocui on 2018/9/29.
 * @Entity 把类跟表映射
 * @Table()可以指定生成表的名称
 */

@Entity
@Data
public class Album {
    @Id
    @GeneratedValue

    private Integer id;
    private String albumCover;
    private String albumTitle;
    private String albumDescription;
    private Integer likes;

    public Album(String albumCover, String albumTitle, String albumDescription, Integer likes) {
        this.albumCover = albumCover;
        this.albumTitle = albumTitle;
        this.albumDescription = albumDescription;
        this.likes = likes;
    }
}
