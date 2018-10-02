package com.example.album.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data

public class PictureList {
    @GeneratedValue
    @Id
    private Integer id;
    private String pictureTitle;
    private String pictureRoad;

    public PictureList(String pictureTitle, String pictureRoad) {
        this.pictureTitle = pictureTitle;
        this.pictureRoad = pictureRoad;
    }

    public PictureList() {
    }

}
