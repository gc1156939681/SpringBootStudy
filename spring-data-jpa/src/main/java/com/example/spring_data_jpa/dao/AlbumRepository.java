package com.example.spring_data_jpa.dao;

import com.example.spring_data_jpa.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by guocui on 2018/9/29.
 */
public interface AlbumRepository extends JpaRepository<Album,Integer> {
    /**
     * @Query("from SysUser u where u.nickname  like CONCAT('%',:nickname,'%') order by  u.fans desc ")
    List<SysUser> findUsers(@Param("nickname") String nickname);

     */
//    @Query("from Album u where u.albumTitle like CONCAT('%',:likes,'%') order by u.likes desc")

    @Query("FROM Album a ORDER BY a.likes DESC")
    List<Album> findHotAlbums();
}
