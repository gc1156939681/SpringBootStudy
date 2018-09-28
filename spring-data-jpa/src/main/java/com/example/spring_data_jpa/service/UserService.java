package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.SysUser;

import java.util.List;

/**
 * Created by guocui on 2018/9/28.
 */
public interface UserService {
    SysUser save(SysUser sysUser);

    //查询所有用户
    List<SysUser> getAll();

    //根据id查询用户信息
    SysUser get(Long id);

    //根据账号查询用户信息
    SysUser findByAccount(String account);

    //根据昵称关键字模糊查询用户信息
    List<SysUser> findByNicknameLike(String nickname);

    //查询昵称含有指定关键词并且按粉丝数降序排列
    List<SysUser> getUsersOrderByFans(String nickname);

    //根据粉丝数量筛选用户
    List<SysUser> findByFansBetween(Integer num1,Integer num2);
}
