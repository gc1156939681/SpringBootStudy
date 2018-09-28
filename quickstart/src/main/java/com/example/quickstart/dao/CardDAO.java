package com.example.quickstart.dao;

import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.Recommend;
import com.example.quickstart.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by guocui on 2018/9/28.
 */
@Configuration
@Data
public class CardDAO {
    public List<Card> getCards() {
        Card[] cards = {
                new Card("水画人", "pengshao.jpg", "vivo.jpg", "发现更多美，vivoX23上手体验", "2018 年上半年，最惊艳的两款国产全面屏手机，" +
                        "非 vivo NEX 和 OPPO Find X 莫属了。NEX 的开创性的带来了全自动升降式摄像头的全面屏解决方案，赢得无数好评。",6,10),
                new Card("呆猫", "cat.jpg" , "4.jpg", "UWP版我的电脑：介系你没有玩过的船新版本", "首先吐槽一下微软：其著名的改名部将“我的电脑”先是改名为“计算机”后又更名成“此电脑”，说到其间的意义怕是希望通过名字的变更告诉用户自己的产品升级了，但是无论是从交互还是UI，却看不出过多升级的踪迹.",10,0),
                new Card("Sol Lo", "sol.jpg", "pro.png", "为汽车加装后置行车记录仪 —— 70迈智能行车记录仪 Pro 体验 ", "最近滴滴出行的各类事件在不断发酵，作为一个司机也需要从各个方面来排查安全隐患，尤其是在到处碰瓷的今天，防患于未然明显成为了一个不得不让人重视的话题了。",100,30),

                new Card("JOKER鹏少", "pengshao.jpg", "google.jpg", "谷歌浏览器的注册使用方法，以及扩展插件的不同安装方式！", "说到浏览器，肯定首先要提到谷歌了，或者叫chrome。大家不必去纠结它的叫法读音，相互关系，发展历史等等对你毫无卵用的东西，你只要知道它好不好用，如何使用就可以了。",24,6),
                new Card("Minja","1.jpg","book.jpg","原汁原味的纸笔体验：柔记智能手写本","尽管已经用 App 做了几年笔记，我仍然念念不忘纸笔的灵便与自由。试过很多智能手写设备后，我觉得柔记手写本是最能保留纸笔体验的智能工具。",30,2),
                new Card("王隐在录音","2.jpg","social.jpg","发长文字没人看？或许是社交平台的锅","本文浅析了各社交平台的长文字展示方式及成因。相比于文字，社交平台会更加鼓励人们发布图片视频，其次是短文字内容，如果你想发布很长的一段文字，不同的平台时间流或许在展现形式上有所不同。不过大体可以通过是否...",53,0),
                new Card("播客头条","3.jpg","blog.jpg","关于播客 你想了解的一切","聊聊播客前世今生，国内海外，以及未来,播客是一种数字媒体，指一系列的音频、视频、电子电台或文字档以列表形式经互联网发布，然后听众经由电子设备订阅该列表以下载或流当中的电子文件，从而接收内容。英语“...",7,1),
                new Card("哪里来的小熊猫","4.jpg","readPerson.png","泛读，从读书到读人，再到读己","「不论何时何地，以何种形式，我总是希望，当新信息流过我的时候，能留下点什么...",16,1)
        };
        List<Card> cardList = Arrays.asList(cards);
        return  cardList;
    }

    public List<Recommend> getRecommends(){
        Recommend[] recommends = {
                new Recommend("read.png","读书笔记","分享我们读书的笔记与心得，记录阅读中和作者产生的碰撞，以及给我们带来的改变...","1345"),
                new Recommend("promote.jpg","提升工作效率", "一个优秀的工具，能让你在提升效率之路事半功倍。你是如何通过这些工具，技巧...","1345"),
                new Recommend("day.png","一日一记","你的手机装了哪些常见或小众的 App？它们如何帮你提高效率，给生活带来更多乐...","1345"),
                new Recommend("android.jpg","Android玩法","你或许深谙刷机之道，他却能把 Xposed 玩得炉火纯青。从手机到应用，从硬件...","1345"),

        };
        List<Recommend> recommendList =Arrays.asList(recommends);
        return recommendList;
    }

    public User getUser(){
        User user = new User();
        user.setAvatar("avatar.png");
        user.setName("果果");
        return user;

    }
}
