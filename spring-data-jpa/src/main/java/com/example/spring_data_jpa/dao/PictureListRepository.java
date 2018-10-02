package com.example.spring_data_jpa.dao;

import com.example.spring_data_jpa.entity.PictureList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureListRepository extends JpaRepository<PictureList,Integer> {
}
