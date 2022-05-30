package com.jx3robot.robot.controller;

import com.jx3robot.robot.service.JX3PriceService;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.FilterValue;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JX3PriceController {

    private final JX3PriceService service;

    @Autowired
    public JX3PriceController(JX3PriceService service){
        this.service = service;
    }

    @Listener
    @Filter(value = "金价(\\s){{serviceName,.*}}",matchType = MatchType.REGEX_MATCHES)
    public void getJX3Daily(MiraiGroupMessageEvent event, @FilterValue("serviceName") String serviceName){
        Message message = service.priceCommon(serviceName);
        // 调试用信息
        //System.out.println(message.toString());
        event.getGroup().sendBlocking(message);
    }
}
