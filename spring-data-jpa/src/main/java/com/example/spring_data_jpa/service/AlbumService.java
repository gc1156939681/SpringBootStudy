package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Album;

import java.util.List;

/**
 * Created by guocui on 2018/9/29.
 */

public interface AlbumService {
    List<Album> findHotAlbums();

    Album get(int id);

    List<Album> getAll();

}
