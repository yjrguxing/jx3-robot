package com.ruoyi.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

/**
 * 蓬莱职业问答控制层
 * @author psyduck
 * @Date 2022/5/27 17:49
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSPengLaiController {

    @Listener
    @Filter(value = "蓬莱",matchType = MatchType.TEXT_EQUALS)
    public void getPengLai(MiraiGroupMessageEvent event){
        Message message = Text.of(
                        "蓬莱基础\n" +
                        "蓬莱宏\n" +
                        "蓬莱PVX\n" +
                        "蓬莱PVP\n" +
                        "蓬莱PVE\n" +
                        "蓬莱铭牌\n" +
                        "蓬莱素材\n" +
                        "蓬莱小册");
        event.getGroup().sendBlocking(message);
    }
    //蓬莱基础
    @Listener
    @Filter(value = "蓬莱基础",matchType = MatchType.TEXT_EQUALS)
    public void getPengLaiJiChu(MiraiGroupMessageEvent event){
        Message message = Text.of("《从入门至精通的蓬莱攻略（基础篇）》——FateClues\n" +
                "https://www.jx3box.com/bps/23240\n" +
                "该篇文章是针对蓬莱PVE基础方面的讲解，门派背景/心诀/技能/秘籍/PVE与PVP基础");
        event.getGroup().sendBlocking(message);
    }
    //蓬莱设置
    @Listener
    @Filter(value = "蓬莱PVX",matchType = MatchType.TEXT_EQUALS)
    public void getPengLaiPVX(MiraiGroupMessageEvent event){
        Message message = Text.of("《从入门至精通的蓬莱攻略（设置篇）》——FateClues\n" +
                "https://www.jx3box.com/bps/28842\n" +
                "该篇文章是针对游戏设置方面的简单讲解，并非只针对蓬莱\n" +
                "蓬莱考试\n" +
                "《蓬莱第一届门派知识模拟考》——FateClues\n" +
                "https://www.jx3box.com/exam/paper/42\n" +
                "巩固知识的门派知识考，成绩不会记录，次数不限，请放心考试\n" +
                "蓬莱前尘\n" +
                "《【江湖无限】蓬莱勇闯前尘副本》——夜宴艺yy\n" +
                "https://www.jx3box.com/bps/37980\n" +
                "关于前尘秘境的一些集合攻略，非常方便——FateClues\n" +
                "蓬莱语文考\n" +
                "《【蓬莱】蓬小莱们的毕业语文考试（门派扫盲行动）》——FateClues\n" +
                "https://www.jx3box.com/exam/#/paper/54\n" +
                "帮助大家认识蓬莱的生僻字，成绩不会记录，次数不限，请放心考试\n" +
                "蓬莱自绝\n" +
                "《【技巧】蓬莱三步上天自绝法》——FateClues\n" +
                "https://www.jx3box.com/bps/22616\n" +
                "自绝技巧，一般用于前尘秘境与攻防中\n" +
                "蓬莱历程\n" +
                "https://www.jx3box.com/bbs/30027\n" +
                "那一年蓬莱来时的路，如此用心");
        event.getGroup().sendBlocking(message);
    }
    //蓬莱插旗
    @Listener
    @Filter(value = "蓬莱PVP",matchType = MatchType.TEXT_EQUALS)
    public void getPengLaiPVP(MiraiGroupMessageEvent event){
        Message message = Text.of("蓬莱PVP进阶\n" +
                "《从入门至精通的蓬莱攻略（PVP进阶篇）》——FateClues\n" +
                "https://www.jx3box.com/bps/28837\n" +
                "该篇文章是针对蓬莱PVP进阶的讲解，本赛季着重学习濯流刷风流与横绝穹庐流\n" +
                "蓬莱插旗\n" +
                "《从入门至精通的蓬莱攻略（插旗篇）》——FateClues\n" +
                "https://www.jx3box.com/bps/28764\n" +
                "该篇文章是针对蓬莱插旗方面的讲解，内含各个门派的须知技能与切磋思路" +
                "蓬莱吃鸡\n" +
                "《从入门至精通的蓬莱攻略（吃鸡篇）》——FateClues\n" +
                "https://www.jx3box.com/bps/28838\n" +
                "该篇文章是针对蓬莱吃鸡方面的讲解，包括一些好用的小技巧\n" +
                "蓬莱攻防\n" +
                "《从入门至精通的蓬莱攻略（攻防篇）》——FateClues\n" +
                "https://www.jx3box.com/bps/28840\n" +
                "该篇文章是针对蓬莱攻防方面的讲解，通用的攻防进阶点");
        event.getGroup().sendBlocking(message);
    }
    //蓬莱PVE
    @Listener
    @Filter(value = "蓬莱PVE",matchType = MatchType.TEXT_EQUALS)
    public void getPengLaiPVE(MiraiGroupMessageEvent event){
        Message message = Text.of("蓬莱PVE进阶\n" +
                "《从入门至精通的蓬莱攻略（PVE进阶篇）》——FateClues\n" +
                "https://www.jx3box.com/bps/28836\n" +
                "该篇文章是针对蓬莱PVE进阶的讲解，本赛季着重学习游仙鸿轨流\n" +
                "蓬莱橙武/CW\n" +
                "《江湖无线版本蓬莱pve橙武循环节点解析及配装推荐》——123（Midnight）\n" +
                "https://www.jx3box.com/bps/39627\n" +
                "针对蓬莱游仙鸿轨流的橙武循环讲解，以及一些配装推荐——FateClues\n" +
                "蓬莱计算器\n" +
                "《蓬莱计算器》——123（Midnight）\n" +
                "https://www.jx3box.com/tool/30914\n" +
                "如果要自己配装，推荐还是按一按计算器哦。注意不要太脆，要适合自己预算的——FateClues\n" +
                "蓬莱浪客行\n" +
                "《从入门至精通的蓬莱攻略（浪客行篇）》——FateClues\n" +
                "https://www.jx3box.com/bps/28839\n" +
                "该篇文章是针对蓬莱浪客行方面的讲解，奇穴选择与思路打法");
        event.getGroup().sendBlocking(message);
    }
    //蓬莱鸿轨宏
    @Listener
    @Filter(value = "蓬莱宏",matchType = MatchType.TEXT_EQUALS)
    public void getPengLaiMacro(MiraiGroupMessageEvent event){
        Message message = Text.of("蓬莱鸿轨宏\n" +
                "《【江湖无限】蓬莱宏 新循环 多种选择 游仙鸿轨流》——FateClues\n" +
                "https://www.jx3box.com/macro/39356\n" +
                "该篇文章是针对蓬莱游仙鸿轨流的宏讲解，是本赛季学习的重点\n" +
                "蓬莱溯徊/藏锋宏\n" +
                "《【江湖无限】蓬莱宏 简单易用 技改解析与调整 溯徊/藏锋流》——FateClues\n" +
                "https://www.jx3box.com/macro/31181\n" +
                "该篇文章是针对蓬莱澄穆罔象的溯徊/藏锋流的宏讲解，偏新手学习向\n" +
                "蓬莱青冥宏\n" +
                "《【雨落柃云】老青冥谒宫流》——雨落柃云\n" +
                "https://www.jx3box.com/macro/21004\n" +
                "针对澄穆罔象流的青冥打法，是澄穆罔象中上限最高的流派——FateClues");
        event.getGroup().sendBlocking(message);
    }
    //蓬莱配装
    @Listener
    @Filter(value = "蓬莱配装",matchType = MatchType.TEXT_EQUALS)
    public void getPengLaiPeiZhuang(MiraiGroupMessageEvent event){
        Message message = Text.of("蓬莱配装\t\n" +
                "https://www.jx3box.com/pz/public?mount=10533\n" +
                "可自由配装或“推荐”中的方案进行复制调整");
        event.getGroup().sendBlocking(message);
    }
    //蓬莱铭牌
    @Listener
    @Filter(value = "蓬莱铭牌",matchType = MatchType.TEXT_EQUALS)
    public void getPengLaiMingPai(MiraiGroupMessageEvent event){
        Message message = Text.of("蓬莱铭牌\n" +
                "蓬莱可以使用铭牌功能了！\n" +
                "https://www.jx3box.com/bbs/34477\n" +
                "感兴趣可以看看试试哦~\n");
        event.getGroup().sendBlocking(message);
    }
    //蓬莱素材
    @Listener
    @Filter(value = "蓬莱素材",matchType = MatchType.TEXT_EQUALS)
    public void getPengLaiSuCai(MiraiGroupMessageEvent event){
        Message message = Text.of("蓬莱素材\n" +
                "《【蓬莱】创作素材整合包》——FateClues\n" +
                "https://www.jx3box.com/tool/27507\n" +
                "这个素材整合包是为了大家在进行内容创作能够更方便，欢迎提出建议，不断进行优化完善");
        event.getGroup().sendBlocking(message);
    }
    //蓬莱小册
    @Listener
    @Filter(value = "蓬莱小册",matchType = MatchType.TEXT_EQUALS)
    public void getPengLaiXiaoCe(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "蓬莱小册\n" +
                "《【蓬莱】门派文集小册》——FateClues\n" +
                "https://www.jx3box.com/bbs/#/collection/38\n" +
                "欢迎补充更多热门/优秀内容");
        event.getGroup().sendBlocking(message);
    }
}
