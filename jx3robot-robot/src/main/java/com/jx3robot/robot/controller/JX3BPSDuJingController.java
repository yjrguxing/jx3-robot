package com.jx3robot.robot.controller;

import com.jx3robot.robot.service.JX3BPSDuJingService;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JX3BPSDuJingController {
    private final JX3BPSDuJingService service;
    @Autowired
    public JX3BPSDuJingController(JX3BPSDuJingService service){
        this.service = service;
    }
    @Listener
    @Filter(value = "毒经",matchType = MatchType.TEXT_EQUALS)
    public void getDuJing(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "毒经入门\n" +
                        "毒经宏\n" +
                        "毒经试炼\n" +
                        "毒经计算器\n" +
                        "毒经配装\n" +
                        "毒经群\n" +
                        "O大是谁");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经入门",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingGoDoor(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "【江湖无限】毒经引导 By.朧月Oboroduki\n" +
                        "https://www.jx3box.com/bps/39376");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经宏",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingMacro(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "毒经云端宏\n" +
                        "-----\n" +
                        "朧月Oboroduki#桃僵\n" +
                        "朧月Oboroduki#懒人一键适用蛇T\n" +
                        "-----\n" +
                        "朧月Oboroduki#篾片蛊\n" +
                        "朧月Oboroduki#篾片辅助\n" +
                        "-----\n" +
                        "朧月Oboroduki#连缘蛊A\n" +
                        "朧月Oboroduki#连缘蛊B\n" +
                        "-----\n" +
                        "朧月Oboroduki#蛇悉流A\n" +
                        "朧月Oboroduki#蛇悉流B\n" +
                        "-----\n" +
                        "输入 毒经+空格+对应云端宏获取该宏详细信息（例：毒经 朧月Oboroduki#桃僵）\n" +
                        "https://www.jx3box.com/macro/18608\n" +
                        "-----\n" +
                        "云端宏使用指南\n" +
                        "https://www.jx3box.com/tool/18152\n" +
                        "\n" +
                        "【特殊】毒经 朧月Oboroduki#桃僵\n" +
                        "/cast 凤凰蛊\n" +
                        "/cast 蛊虫献祭\n" +
                        "/cast 蛊虫狂暴\n" +
                        "/fcast 幻击\n" +
                        "/cast 蛇影\n" +
                        "/cast 百足\n" +
                        "/cast 蝎心\n" +
                        "/cast 蟾啸\n" +
                        "/cast 千丝\n" +
                        "注：手动招蛇，手动攻击，手动灵蛊，适配玉简\n" +
                        "奇穴：略");
        event.getGroup().sendBlocking(message);
    }


    @Listener
    @Filter(value = "毒经 朧月Oboroduki#桃僵",matchType = MatchType.REGEX_MATCHES)
    public void getDuJingMacroInfo1(MiraiGroupMessageEvent event){
        Message message = Text.of(service.getDuJingMacro("桃僵"));
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经 朧月Oboroduki#懒人一键适用蛇T",matchType = MatchType.REGEX_MATCHES)
    public void getDuJingMacroInfo2(MiraiGroupMessageEvent event){
        Message message = Text.of(service.getDuJingMacro("懒人一键适用蛇T"));
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经 朧月Oboroduki#篾片蛊",matchType = MatchType.REGEX_MATCHES)
    public void getDuJingMacroInfo3(MiraiGroupMessageEvent event){
        Message message = Text.of(service.getDuJingMacro("篾片蛊"));
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经 朧月Oboroduki#篾片辅助",matchType = MatchType.REGEX_MATCHES)
    public void getDuJingMacroInfo4(MiraiGroupMessageEvent event){
        Message message = Text.of(service.getDuJingMacro("篾片辅助"));
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经 朧月Oboroduki#连缘蛊A",matchType = MatchType.REGEX_MATCHES)
    public void getDuJingMacroInfo5(MiraiGroupMessageEvent event){
        Message message = Text.of(service.getDuJingMacro("连缘蛊A"));
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经 朧月Oboroduki#连缘蛊B",matchType = MatchType.REGEX_MATCHES)
    public void getDuJingMacroInfo6(MiraiGroupMessageEvent event){
        Message message = Text.of(service.getDuJingMacro("连缘蛊B"));
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经 朧月Oboroduki#蛇悉流A",matchType = MatchType.REGEX_MATCHES)
    public void getDuJingMacroInfo7(MiraiGroupMessageEvent event){
        Message message = Text.of(service.getDuJingMacro("蛇悉流A"));
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "毒经 朧月Oboroduki#蛇悉流B",matchType = MatchType.REGEX_MATCHES)
    public void getDuJingMacroInfo8(MiraiGroupMessageEvent event){
        Message message = Text.of(service.getDuJingMacro("蛇悉流B"));
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
                        "后续配装更新地址：https://www.jx3box.com/bps/41780\n");
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

    @Listener
    @Filter(value = "O大是谁",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingKOL(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "O大是世界上最厉害的人");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "0大",matchType = MatchType.TEXT_EQUALS)
    public void getDuJingWaring(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "你喊O大是0大想被禁言是吗");
        event.getGroup().sendBlocking(message);
    }




}
