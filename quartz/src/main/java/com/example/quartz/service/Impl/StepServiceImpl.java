package com.example.quartz.service.Impl;

import com.example.quartz.dao.StepRepository;
import com.example.quartz.entity.Step;
import com.example.quartz.service.StepService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by guocui on 2018/10/12.
 */
@Service
public class StepServiceImpl implements StepService{

    @Resource
    private StepRepository stepRepository;

    @Override
    public void updateWalks() {
        List<Step> list = stepRepository.findAll();
        Random random = new Random();
        for (int i=0;i<list.size();i++){
            Step step = list.get(i);
            step.setNumber(String.valueOf(random.nextInt(20000)+20000));
            step.setDate(new Date());
           stepRepository.saveAndFlush(step);
        }
    }
}
