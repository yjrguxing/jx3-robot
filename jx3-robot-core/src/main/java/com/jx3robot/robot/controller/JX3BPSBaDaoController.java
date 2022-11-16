package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

/**
 * 剑三职业问答霸刀
 * @author psyduck
 * @Date 2022/6/re19:40
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSBaDaoController {
    @Listener
    @Filter(value = "霸刀",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "北傲诀",matchType = MatchType.TEXT_EQUALS)
    public void getBaDao(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "霸刀宏\n" +
                        "霸刀PVE基础\n" +
                        "霸刀PVE进阶\n" +
                        "霸刀计算器\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "霸刀宏",matchType = MatchType.TEXT_EQUALS)
    public void getBaDaoMacro(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "标题：《上将蛇》——沧海\n" +
                        "链接：https://www.jx3box.com/macro/41716\n" +
                        "简介：一款循环和技能数合理的【江湖无限】版本玉简上将蛇流一键宏。\n" +
                        "\n" +
                        "标题：《蛇项一键宏》——寒烟月\n" +
                        "链接：https://www.jx3box.com/macro/41398\n" +
                        "简介：一款技能数合理的【江湖无限】版本玉简蛇项一键宏\n" +
                        "\n" +
                        "标题：《橙武五刀蛇辅助参考》——漱泉\n" +
                        "链接：https://www.jx3box.com/macro/34689\n" +
                        "简介：面向橙武上将白蛇流的一套辅助宏");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "霸刀PVE基础",matchType = MatchType.TEXT_EQUALS)
    public void getBaDaoSimPlePVE(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "标题：视频：《PVE新手设置教程》——风某人\n" +
                        "链接：https://www.bilibili.com/video/BV1a34y1R71K\n" +
                        "简介：本视频面向霸刀新手玩家，讲解了霸刀相关的游戏设置等内容\n" +
                        "\n" +
                        "标题：《【江湖无限】版本霸刀PVE白皮书》——世界成冰\n" +
                        "链接：https://games.xoyo.com/content/dynamic/?id=6268af377d071800136f0ef2\n" +
                        "简介：这篇文章是针对【江湖无限】版本霸刀PVE方向改动和流派的讲解，包含版本技改/流派/奇穴/循环的讲解。\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "霸刀PVE进阶",matchType = MatchType.TEXT_EQUALS)
    public void getBaDaoPVE(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "标题：视频：《25英雄河阳之战1-5讲解教学》——风某人\n" +
                        "链接：https://www.bilibili.com/video/BV1KZ4y1y7Kz\n" +
                        "简介：本视频集包含了【江湖无限】版本25人英雄难度河阳之战boss关卡的讲解。\n" +
                        "\n" +
                        "标题：《【江湖无限】25人河阳之战霸刀简要攻略》——您配玩霸刀么\n" +
                        "链接：https://www.jx3box.com/bps/38762\n" +
                        "简介：这篇文章针对霸刀在25人普通、英雄难度河阳之战中的机制处理进行了讲解。\n" +
                        "\n" +
                        "标题：视频：《PVE突破DPS瓶颈的关键——连点键盘使用教程》——深云-\n" +
                        "链接：https://www.bilibili.com/video/BV1Lb4y1i7LD\n" +
                        "简介：本视频包含使用硬、软件完成按键连点的设置等内容的讲解，霸刀玩家可以参考，配合辅助宏实现dps的提高。\n" +
                        "\n" +
                        "标题：《霸刀辅助宏编写经验分享》——流觞\n" +
                        "链接：https://www.jx3box.com/bps/41311\n" +
                        "简介：这篇文章讲解了霸刀PVE使用辅助宏的原因和辅助宏的编写思路。\n" +
                        "\n" +
                        "标题：《橙武霸刀PVE二段加速可行性研究（更新赛季配装建议）》——漱泉\n" +
                        "链接：https://www.jx3box.com/bps/41371\n" +
                        "简介：面向橙武霸刀的PVE二段加速可行性的探讨和相关配装更改建议。");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "霸刀计算器",matchType = MatchType.TEXT_EQUALS)
    public void getBaDaoCalculator(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "标题：【江湖无限】霸刀PVE计算器\n" +
                        "链接：http://kai66lab.com/analysis/bd.html\n" +
                        "简介：江湖无限版本的霸刀PVE计算器");
        event.getGroup().sendBlocking(message);
    }
}
