package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JX3BPSDuJingController {
    @Listener
    @Filter(value = "毒经",matchType = MatchType.TEXT_EQUALS)
    public void getDuJing(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "毒经入门\n" +
                        "毒经宏\n" +
                        "毒经试炼\n" +
                        "毒经计算器\n" +
                        "毒经配装\n" +
                        "毒经群");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经入门",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingGoDoor(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "江湖无限】毒经引导 By.朧月Oboroduki\n" +
                        "https://www.jx3box.com/bps/39376");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经宏",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingMacro(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "功能开发中！稍后上线哦！");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经试炼",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingShiLian(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "【江湖无限】毒经试炼之地攻略 By.烟雨梧桐 \n" +
                        "https://www.jx3box.com/bps/39479");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经计算器",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingCalculator(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "毒经DPS计算器\n" +
                        "https://www.jx3box.com/tool/30960");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经配装",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingPeiZhuang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "总原则：先遇到什么拍什么，拍完拿计算机计算接下来要什么装备。\n" +
                        "后续配装更新地址：https://www.jx3box.com/macro/18608\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经群",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingGroup(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "【1群】1077613664\n" +
                        "【2群】451392361\n" +
                        "【3群】971843976");
        event.getGroup().sendBlocking(message);
    }
}
