package com.example.spring_data_jpa.dao;

import com.example.spring_data_jpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by guocui on 2018/9/28.
 */
public interface UserRepository extends JpaRepository<SysUser,Long> {


    /**
     * 根据账号查询用户
     * @param account
     * @return
     */
    SysUser findByAccount(String account);

    /**
     * 根据粉丝数量筛选
     * @param num1
     * @param num2
     * @return
     */
    List<SysUser> findByFansBetween(Integer num1, Integer num2);

    /**
     * 根据昵称关键字查询
     * @param nickname
     * @return
     */
    List<SysUser> findByNicknameLike(String nickname);

    /**
     * 查询昵称含有指定关键词并且按粉丝数量降序排列
     * @param nickname
     * @return
     */
    @Query("from SysUser u where u.nickname  like CONCAT('%',:nickname,'%') order by  u.fans desc ")
    List<SysUser> findUsers(@Param("nickname") String nickname);



    //根据昵称查询，自定义JPQL语句
    @Query("from SysUser u where u.nickname=:nickname")
    SysUser findUser(@Param("nickname") String nickname);

}
