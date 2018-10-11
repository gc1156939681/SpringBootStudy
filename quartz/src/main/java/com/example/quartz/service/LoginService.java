package com.example.quartz.service;

import com.example.quartz.entity.SportUser;
import com.example.quartz.entity.Step;

import java.util.List;


public interface LoginService {
    List<SportUser> get (String account, String password);

    SportUser check(String account,String password);

    List<Step> getAll();
}
