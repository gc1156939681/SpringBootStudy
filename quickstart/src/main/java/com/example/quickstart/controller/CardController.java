package com.example.quickstart.controller;

import com.example.quickstart.dao.CardDAO;
import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.Recommend;
import com.example.quickstart.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by guocui on 2018/9/28.
 */
@Controller
public class CardController {
    @Resource
    private CardDAO cardDAO;
    @GetMapping("card")
    public String getAll(ModelMap map){
        List<Card> cardList = cardDAO.getCards();
        List<Recommend> recommendList = cardDAO.getRecommends();
        User user = cardDAO.getUser();
        //将模型加入视图
        map.addAttribute("cardList",cardList);
        map.addAttribute("recommendList",recommendList);
        map.addAttribute("user",user);
        return "card";
    }
}
