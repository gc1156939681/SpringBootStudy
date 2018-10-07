package com.example.timedtask.dao;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleTask {
    @Scheduled(cron = "0/10 * * * * ?")
    public void executeCorpTask1() {
        System.out.println(new Date() + "开始执行任务...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date() +"任务执行结束...");
    }
}
