package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.entity.Student;
import com.example.spring_data_jpa.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by guocui on 2018/9/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {
    @Resource
    private StudentService studentService;

    @Test
    public void save() throws Exception {
        String[] names = {"aa", "bb", "cc","dd","ee"};
        Random random = new Random();
        for (int i=0; i<5; i++){
            Student student = new Student();
            student.setStuName(names[i]);
            student.setStuAge(random.nextInt(30));
            System.out.println(studentService.save(student));
        }

    }

    @Test
    public void getAll() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}