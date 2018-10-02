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
                new SysUser("1156939681@qq.com","123456","且听风吟",100),
                new SysUser("1758042694","666666","花花家的小公举",145),
                new SysUser("1120845268@qq.com","888888","一粒的算命先生",75),
                new SysUser("981006610@qq.com","111111","啊云飘呀飘呀飘",280),
                new SysUser("2440196667@qq.com","123456","林深时见鹿",289),
                new SysUser("huangjihai0023@163.com","666666","骄阳似我",1056),
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