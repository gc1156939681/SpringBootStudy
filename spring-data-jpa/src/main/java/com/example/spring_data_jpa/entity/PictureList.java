package com.example.spring_data_jpa.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class PictureList {
    @Id
    @GeneratedValue
    private Integer id;
    private String pictureTitle;
    private String pictureLink;

    public PictureList(String pictureTitle, String pictureLink) {
        this.pictureTitle = pictureTitle;
        this.pictureLink = pictureLink;
    }

    public PictureList() {
    }
}
