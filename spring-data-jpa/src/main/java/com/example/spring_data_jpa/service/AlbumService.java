package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Album;

import java.util.List;

/**
 * Created by guocui on 2018/9/29.
 */

public interface AlbumService {
    Album save(Album album);
    List<Album> getAll();
    Album get(int id);
    void delete(int id);
}
