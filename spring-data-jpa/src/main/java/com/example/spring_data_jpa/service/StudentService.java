package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Student;

import java.util.List;

/**
 * Created by guocui on 2018/9/28.
 */
public interface StudentService {
    Student save(Student student);
    List<Student> getAll();
    Student get(int id);
    void delete(int id);
}
