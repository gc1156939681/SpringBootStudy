package com.example.spring_boot_websocket.controller;

import com.example.spring_boot_websocket.config.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


@Controller
public class WebSocketController {

    @RequestMapping("/socket")
    public String openTencent(){
//        String info = "";
//        try {
//            info = WebSocketServer.getAllInfo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        map.addAttribute("info",info);
        return "tencent";
    }

    /**
     * 推送数据
     * @param say
     * @return
     */
    @RequestMapping("/socket/push")
    public String pushMsg(@RequestParam("say") String say) {
        try {
            WebSocketServer.sendInfo("服务器推送消息"+say);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "tencent";
    }
}