package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JX3BPSCangJianController {
    @Listener
    @Filter(value = "藏剑",matchType = MatchType.TEXT_EQUALS)
    public void getCangjian(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "藏剑宏\n" +
                        "藏剑加速\n" +
                        "藏剑秘籍\n" +
                        "藏剑配装\n" +
                        "藏剑装备选择\n" +
                        "藏剑计算器\n" +
                    "藏剑常见问题\n" +
                    "藏剑打法探究\n" +
                    "藏剑循环视频");
        event.getGroup().sendBlocking(message);
    }
}
