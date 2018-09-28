package com.example.spring_data_jpa.dao;

import com.example.spring_data_jpa.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by guocui on 2018/9/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;

    @Test
    public void initData(){
        //创建六条数据
        SysUser[] users = {
                new SysUser("ggg@qq.com","111","哈哈哈",45),
                new SysUser("hhh@qq.com","222","简书",85),
                new SysUser("iii@qq.com","333","土鼠",75),
                new SysUser("jjj@qq.com","444","星帽",280),
                new SysUser("kkk@qq.com","555","小贝",289),
                new SysUser("lll@qq.com","666","路边看雪的小女孩",1056),
        };
        for (int i = 0 ; i < 6 ; i++ ){
            userRepository.save(users[i]);
        }
    }
    @Test
    public void findByAccount() throws Exception {
        SysUser sysUser = userRepository.findByAccount("aaa@qq.com");
        System.out.println(sysUser);
    }

    @Test
    public void findByFansBetween() throws Exception {
        List<SysUser> sysUsers = userRepository.findByFansBetween(0,100);
        sysUsers.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void findByNicknameLike() throws Exception {

    }

    @Test
    public void findUsers() throws Exception {
        List<SysUser> users = userRepository.findUsers("简");
        users.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void findUser() throws Exception {

    }

}