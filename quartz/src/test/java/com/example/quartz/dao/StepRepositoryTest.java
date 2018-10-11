package com.example.quartz.dao;

import com.example.quartz.entity.Step;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by guocui on 2018/10/10.
 */
public class StepRepositoryTest {
    @Resource
    private StepRepository stepRepository;

    @Test
    public void find() {
        List<Step> steps = stepRepository.find();
        steps.forEach(step -> System.out.println(step));
    }

    @Test
    public void findUser() {
    }

}