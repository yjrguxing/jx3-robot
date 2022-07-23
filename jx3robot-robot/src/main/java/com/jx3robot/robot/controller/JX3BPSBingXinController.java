package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

/**
 * 剑三冰心职业问答控制层
 * @author psyduck
 * @Date 2022/5/24 22:44
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSBingXinController {
    @Listener
    @Filter(value = "冰心",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "冰心诀",matchType = MatchType.TEXT_EQUALS)
    public void getBingXin(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "冰心白皮书\n" +
                        "冰心宏\n" +
                        "冰心配装\n" +
                        "冰心循环");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "冰心白皮书",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "冰心配装",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "冰心循环",matchType = MatchType.TEXT_EQUALS)
    public void getBingXinWhitePaper(MiraiGroupMessageEvent event){
        Message message = Text.of("冰心白皮书:https://www.jx3box.com/bps/39670\n" +
                "有问题先了解白皮书，技能介绍、奇穴、秘籍、循环、实战技巧、辅助宏、插件设置、大附魔、配装及属性收益皆在其中，轻松实现从入门到熟手的提升！");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "冰心宏",matchType = MatchType.TEXT_EQUALS)
    public void getBingXinMacro(MiraiGroupMessageEvent event){
        Message message = Text.of("冰心宏:https://www.jx3box.com/macro/10800\n" +
                "用宏之前先看说明再使用，防止被出警！\n");
        event.getGroup().sendBlocking(message);
    }
}
