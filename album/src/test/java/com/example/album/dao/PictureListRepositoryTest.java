package com.example.album.dao;


import com.example.album.entity.PictureList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class PictureListRepositoryTest {
    @Resource
    private PictureListRepository pictureListRepository;
    @Test
    public void initData(){        PictureList[] pictureLists={
            new PictureList("海蓝之笺","https://goo.gl/37Rns6"),
            new PictureList("延伸的宫殿","https://goo.gl/7Xnx3F"),
            new PictureList("向日葵的海洋","https://goo.gl/hPzJZG"),
            new PictureList("晨起江边","https://goo.gl/jxUNK3"),
            new PictureList("星辉月映","https://goo.gl/GJM7NB"),
            new PictureList("modole","https://https://goo.gl/65YrfT"),
            new PictureList("幽幽海啦啦","https://goo.gl/65YrfT"),
            new PictureList("云端少女","https://goo.gl/BWySuW"),
            new PictureList("弥渡","https://goo.gl/346EJj"),

    };
        for (int i=0;i<pictureLists.length;i++){
            pictureListRepository.save(pictureLists[i]);
        }
    }
}