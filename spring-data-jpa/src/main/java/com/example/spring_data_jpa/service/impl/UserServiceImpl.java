package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.dao.UserRepository;
import com.example.spring_data_jpa.entity.SysUser;
import com.example.spring_data_jpa.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by guocui on 2018/9/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    @Transactional
    public SysUser save(SysUser sysUser) {
        return userRepository.save(sysUser);
    }

    @Override
    public List<SysUser> getAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public SysUser get(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    @Transactional
    public SysUser findByAccount(String account) {
        return userRepository.findByAccount(account);
    }

    @Override
    public List<SysUser> findByNicknameLike(String nickname) {
        return userRepository.findByNicknameLike(nickname);
    }

    @Override
    public List<SysUser> getUsersOrderByFans(String nickname) {
        return  userRepository.findUsers(nickname);
    }

    @Override
    public List<SysUser> findByFansBetween(Integer num1, Integer num2) {
        return userRepository.findByFansBetween(num1,num2);
    }
}
