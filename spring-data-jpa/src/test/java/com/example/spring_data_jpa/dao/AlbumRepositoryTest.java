package com.example.spring_data_jpa.dao;

import com.example.spring_data_jpa.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by guocui on 2018/9/29.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {

    @Resource
    private AlbumRepository albumRepository;


    @Test
    public void initData(){
        Album[] albums = {
          new Album("https://goo.gl/uBaAAQ","月光海螺","月光和海螺的奇妙碰撞",10150),
                new Album("https://goo.gl/uBaAAQ","圣保罗教堂","- 法国斯特拉斯堡的路德会教堂，哥特复兴式风格的代表作，建于1892年到1897年。",6400),
                new Album("https://goo.gl/GJ5XpU","火光","这里的硫化气体真的是很重，需要带防毒面",10150),
                new Album("https://goo.gl/W6K47W","月饼","20180924·桃山皮月饼·无尽意",16780),
                new Album("https://goo.gl/66yVux","手账","今天忘记发首长了",28456),
                new Album("https://goo.gl/qsYg6v","章节","第一章是一支巧克力味的烟。",5979),
        };

        for (int i = 0 ; i < 6 ; i++ ){
           albumRepository.save(albums[i]);
        }
    }
    @Test
    public void findHotAlbums() throws Exception {
        List<Album> albums = albumRepository.findHotAlbums();
        albums.forEach(album -> System.out.println(album));
    }

}