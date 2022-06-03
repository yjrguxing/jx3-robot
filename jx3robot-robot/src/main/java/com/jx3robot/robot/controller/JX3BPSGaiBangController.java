package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

/**
 * 剑三丐帮职业问答
 * @author psyduck
 * @Date 2022/6/2 20:56
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSGaiBangController {

    @Listener
    @Filter(value = "丐帮",matchType = MatchType.TEXT_EQUALS)
    public void getGaiBang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "丐帮指南\n" +
                        "丐帮配装\n" +
                        "丐帮DPS计算器\n" +
                        "丐帮木桩视频\n" +
                        "丐帮宏");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "丐帮指南",matchType = MatchType.TEXT_EQUALS)
    public void getGaiBangZhiNan(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/bps/39442 by圣光弹\n" +
                        "从基础到提高内容均有涉猎，讲解了大部分主流打法的思路、循环和常用技巧，想真正学会丐帮的同门们可以精读此文。\n" +
                        "https://www.jx3box.com/bps/33627 by君山PVE教育局\n" +
                        "包含了大部分主流打法的攻略，内容与上文并不冲突，部分内容并不重复。\n" +
                        "建议有想法的同门们都看一遍。");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "丐帮配装",matchType = MatchType.TEXT_EQUALS)
    public void getGaiBangPeiZhuang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/bps/39682 by 君山PVE教育局");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "丐帮DPS计算器",matchType = MatchType.TEXT_EQUALS)
    public void getGaiBangCalculator(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/tool/29389 by 君山PVE教育局");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "丐帮木桩视频",matchType = MatchType.TEXT_EQUALS)
    public void getGaiBangMuZhuang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "【洪荒烟霞&满盈烟霞】\n" +
                        "https://www.bilibili.com/video/BV1du411q7RT by 圣光弹\n" +
                        "【烟霞一掌】\n" +
                        "https://www.bilibili.com/video/BV1FU4y1Z73m by圣光弹\n" +
                        "【龙醒城复】\n" +
                        "https://www.bilibili.com/video/BV1DF411j744 by橘右京\n" +
                        "【龙醒云龙】\n" +
                        "https://www.bilibili.com/video/BV1gA4y1S74W by不武\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "丐帮宏",matchType = MatchType.TEXT_EQUALS)
    public void getGaiBangMacro(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/macro/33645 by君山PVE教育局\n" +
                        "https://www.jx3box.com/macro/41265 by流沙");
        event.getGroup().sendBlocking(message);
    }
}
