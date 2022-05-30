package com.jx3robot.robot.controller;

import com.jx3robot.robot.service.JX3DailyService;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

/**
 * 剑三日常控制层
 * @author psyduck
 * @Date 2022/5/8 19:16
 * @see
 * @version 1.0
 **/
@RestController
public class JX3DailyController {

    private final JX3DailyService service;

    @Autowired
    public JX3DailyController(JX3DailyService service) {
        this.service = service;
    }

    @Listener
    @Filter(value = "日常",matchType = MatchType.TEXT_EQUALS)
    public void getJX3Daily(MiraiGroupMessageEvent event){
        // 获取今天日期
        Calendar calendar = Calendar.getInstance();
        String date = calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.DAY_OF_MONTH);

        Message message = service.dailyCommon(date);
        // 调试用信息
        //System.out.println(message.toString());
        event.getGroup().sendBlocking(message);
    }
}
