package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.dao.StudentRepository;
import com.example.spring_data_jpa.entity.Student;
import com.example.spring_data_jpa.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by guocui on 2018/9/28.
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Resource
    private StudentRepository studentRepository;
    @Override
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override

    public List<Student> getAll() {
        {
            return studentRepository.findAll();
        }
    }

    @Override
    @Transactional
    public Student get(int id) {
            return studentRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void delete(int id) {
            studentRepository.deleteById(id);
    }
}
