package com.example.album.dao;

import com.example.album.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {
    @Resource
    private AlbumRepository albumRepository;

    @Test
    public void initData(){
        Album[] albums = {
                new Album("https://goo.gl/uBaAAQ","狂野生灵","这里是最美好的大自然",10150),
                new Album("https://goo.gl/uBaAAQ","治愈美食","- 美食杂志主编Charles Duchemin(Louis de Funès)具有天赋异禀的嗅觉和味觉，食物经他的鼻子一闻、嘴巴一品，是否真如传说中美味便可得知。",6400),
                new Album("https://goo.gl/GJ5XpU","恋物小癖","偏爱一味，对事情充满无限喜爱",10150),
                new Album("https://goo.gl/W6K47W","惬意生活","在嘈杂的城市里留有自己的一方净土",16780),
                new Album("https://goo.gl/66yVux","影视动漫","完美动力做梦想的助力者",28456),
                new Album("https://goo.gl/qsYg6v","自然万物","日落乌云涨，半夜听雨响。日落西山一点红，半夜起来搭雨篷。日落胭脂红，非雨便是风。",5979),

        };
        for(int i=0;i<albums.length;i++){
            albumRepository.save(albums[i]);
        }
    }


    @Test
    public void findHotAlbum() {

    }
}