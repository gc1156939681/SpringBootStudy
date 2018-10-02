package com.example.spring_data_jpa.dao;

import com.example.spring_data_jpa.entity.PictureList;
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
    public void initData() {
        PictureList[] pictureLists = {
                new PictureList("《阿甘正传》", "https://upload-images.jianshu.io/upload_images/5377313-ea293fc6b5b60ffd?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("观《玉娇龙》――再评《卧虎藏龙》", "https://upload-images.jianshu.io/upload_images/14247473-93ebaf33a457cdee.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("国庆影评|《无双》", "https://upload-images.jianshu.io/upload_images/9118876-eac302ed56cbd38a?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("去留下足迹", "https://upload-images.jianshu.io/upload_images/7771834-7f06cad45b9d6baa.png?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("彩铅（35）", "https://upload-images.jianshu.io/upload_images/5188183-4640da96ae96732a.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("第一幅个人原创插画- 幸好有暖暖的你", "https://upload-images.jianshu.io/upload_images/8379443-0f3dcb4c3ad59e91.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("禅绕插画~我们仨", "https://upload-images.jianshu.io/upload_images/3311936-a12f4b8a76d5c5f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("现在与过去相互依存的山城", "https://upload-images.jianshu.io/upload_images/4175008-bd5613b2ebd1be26.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("大鸟范 | 原创手机壁纸", "https://upload-images.jianshu.io/upload_images/2634547-0b3208a1865e9d4b.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("虚实之都", "https://upload-images.jianshu.io/upload_images/14237043-0910011cfe3e4c77.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("小米、美团、拼多多MMP崛起背后的逻辑", "https://upload-images.jianshu.io/upload_images/1491579-a1f1944817c462fb.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("我的计算机书籍推荐清单", "https://upload-images.jianshu.io/upload_images/7131149-ddb1cedb25a9aa8d.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("区块链的即时通讯，币圈的微信？", "https://upload-images.jianshu.io/upload_images/13206790-b71eb9fc0547dfc3.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("才用上4G？先来看看高通5G天线长啥样", "https://upload-images.jianshu.io/upload_images/10019972-d55d579118bcb506.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("读《进击的巨人》后感", "https://upload-images.jianshu.io/upload_images/9333185-1818a3cb7b06ae99.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("是分离让小王子更思念他的玫瑰，爱就是责任", "https://upload-images.jianshu.io/upload_images/6543532-2f7b21e39b080015.png?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("孤独的人类，走过一个一个百年", "https://upload-images.jianshu.io/upload_images/14025924-0246cbfcea3acd92.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("水煎迷你素花包", "https://upload-images.jianshu.io/upload_images/9294643-44869745819ef12c.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
        };

        for (int i = 0; i < 18; i++) {
            pictureListRepository.save(pictureLists[i]);
        }
    }
}