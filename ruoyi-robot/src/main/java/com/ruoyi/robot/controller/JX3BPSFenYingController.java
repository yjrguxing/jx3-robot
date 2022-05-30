package com.ruoyi.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

/**
 * 剑三焚影职业问答
 * @author psyduck
 * @Date 2022/5/30 13:39
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSFenYingController {

    @Listener
    @Filter(value = "焚影",matchType = MatchType.TEXT_EQUALS)
    public void getFenYing(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "焚影白皮书\n" +
                        "焚影新手宏\n" +
                        "焚影设置\n" +
                        "焚影计算器\n" +
                        "焚影试炼\n" +
                        "焚影交流群");

        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "焚影新手宏",matchType = MatchType.TEXT_EQUALS)
    public void getFenYingMacro(MiraiGroupMessageEvent event){
        Message message = Text.of("焚影推荐一键宏（需要残卷大附魔）：https://docs.qq.com/doc/DVUhrQU5MYW96ZEFS\n" +
                "摆烂一键宏（无需大附魔直接按键开启）：https://www.jx3box.com/macro/22574");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "焚影设置",matchType = MatchType.TEXT_EQUALS)
    public void getFenYingOption(MiraiGroupMessageEvent event){
        Message message = Text.of("按键精灵设置教程：https://docs.qq.com/doc/DUWVDVXVyYWN4cWRu\n" +
                "罗技鼠标宏设置教程：https://docs.qq.com/doc/DUUxsbHlBZkJzelp3\n" +
                "雷蛇鼠标宏设置教程：\n" +
                "https://docs.qq.com/doc/DSXNTeGdDaXdUY2dR");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "焚影白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getFenYingWhitePaer(MiraiGroupMessageEvent event){
        Message message = Text.of("100/60驱夷（进阶必学，是焚影的基础循环）：\n" +
                "https://docs.qq.com/doc/DVWd0bldCRHRSdW1a\n" +
                "白皮书（第三章包含配装与属性指导）：\n" +
                "https://docs.qq.com/doc/DVWJRZEVVQ1F2b0pI");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "焚影计算器",matchType = MatchType.TEXT_EQUALS)
    public void getFenYingCalculator(MiraiGroupMessageEvent event){
        Message message = Text.of("https://docs.qq.com/doc/DUWpheGNRQUdoc2hw");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "焚影试炼",matchType = MatchType.TEXT_EQUALS)
    public void getFenYingShiLian(MiraiGroupMessageEvent event){
        Message message = Text.of("https://docs.qq.com/doc/DVXR2QWVOQnlHWFlU\n" +
                "试炼之地视频讲解：https://www.bilibili.com/video/BV1Qz4y167LL");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "焚影交流群",matchType = MatchType.TEXT_EQUALS)
    public void getFenYingShare(MiraiGroupMessageEvent event){
        Message message = Text.of("PVE:一群317608470，二群1097076533");
        event.getGroup().sendBlocking(message);
    }

}
