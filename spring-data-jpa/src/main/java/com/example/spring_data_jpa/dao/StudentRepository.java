package com.example.spring_data_jpa.dao;

import com.example.spring_data_jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by guocui on 2018/9/28.
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
