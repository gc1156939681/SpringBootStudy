package com.example.quartz.factory;

import com.example.quartz.service.StepService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by guocui on 2018/10/12.
 */
@Component
public class SportJob {
    @Resource
    private StepService stepService;
    //设置每天下午16:16分更新数据
    @Scheduled(cron = "0 16 16 * * ? ")
    public void updateTodayWalks() throws Exception {
        stepService.updateWalks();
    }
}
