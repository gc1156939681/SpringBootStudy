package com.example.album.dao;

import com.example.album.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumRepository  extends JpaRepository<Album,Integer> {
    @Query("FROM Album a ORDER BY a.likes DESC")
    List<Album> findHotAlbum();
}
