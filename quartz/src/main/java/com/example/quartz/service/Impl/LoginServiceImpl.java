package com.example.quartz.service.Impl;

import com.example.quartz.dao.LoginRepository;
import com.example.quartz.dao.StepRepository;
import com.example.quartz.entity.SportUser;
import com.example.quartz.entity.Step;
import com.example.quartz.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginRepository loginRepository;

    @Resource
    private StepRepository stepRepository;


    @Override
    public List<SportUser> get(String account, String password) {
        return loginRepository.findAll();
    }

    @Override
    public SportUser check(String account, String password) {
        List<SportUser> users = loginRepository.findAll();
        SportUser user = new SportUser();
        for (int i=0;i<users.size();i++){
            String name = users.get(i).getAccount();
            String pass = users.get(i).getPassword();
            if (name.equals(account)){
                if (pass.equals(password)){
                    user = users.get(i);
                }
            }
        }
        return user;
    }

    @Override
    public List<Step> getAll() {
        return stepRepository.findAll();
    }

}
