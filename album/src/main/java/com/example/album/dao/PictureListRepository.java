package com.example.album.dao;

import com.example.album.entity.PictureList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureListRepository extends JpaRepository<PictureList,Integer> {
}
