package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

/**
 * 剑三易筋控制层
 * @author psyduck
 * @Date 2022/5/26 22:27
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSYiJingController {
    @Listener
    @Filter(value = "易筋",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "易筋经",matchType = MatchType.TEXT_EQUALS)
    public void getYiJing(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "易筋入门\n" +
                        "易筋攻略\n" +
                        "易筋奇穴\n" +
                        "易筋试炼\n" +
                        "金刚攻略\n" +
                        "易筋精简\n" +
                        "易筋加速\n" +
                        "易筋配装\n" +
                        "易筋宏");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "易筋入门",matchType = MatchType.TEXT_EQUALS)
    public void getYiJingGoDoor(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/bps/40194 章节1光速上手直接加入少林寺（奇穴/一键宏）");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "易筋攻略",matchType = MatchType.TEXT_EQUALS)
    public void getYiJingGongLue(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/bps/40194\n" +
                        "包括技改全解技能奇穴解析，入门循环，进阶循环，数值计算和副本配装。");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "易筋奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getYiJingQiXue(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "非玉简\n" +
                        "[明法][幻身][身意/纷纭][缩地][降魔][金刚][净果][三生][众嗔][华香][佛果][醍醐]\n" +
                        "一键宏玉简\n" +
                        "[明法][幻身][身意][缩地][降魔][金刚][净果][三生][众嗔][华香][佛果][心诤]\n" +
                        "进阶玉简\n" +
                        "[明法][幻身][纷纭][缩地][降魔][金刚][净果][三生][众嗔][华香][佛果][心诤]");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "易筋试炼",matchType = MatchType.TEXT_EQUALS)
    public void getYiJingShiLian(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/bps/34624（北天药宗赛季，江湖无限版本加入纷纭循环）");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "金刚攻略",matchType = MatchType.TEXT_EQUALS)
    public void getYiJingJinGang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/bps/21434");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "易筋精简",matchType = MatchType.TEXT_EQUALS)
    public void getYiJingJingJian(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "第一梯队：纯无腰带 破无手 纯破裤子 破无/纯无戒指\n" +
                        "第二梯队 双会破手 会破无裤子 会破戒指 （可要可不要）\n" +
                        "第三梯队（带体质） 破无腰带 纯无护手 纯无裤子 会无戒指\n" +
                        "第四梯队 凑乎穿的 各种带破招的精简");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "易筋加速",matchType = MatchType.TEXT_EQUALS)
    public void getYiJingSpeed(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "非CW仅推荐一段加速（蓝色附魔或者喝酒均可）\n" +
                        "CW或者满品小CW推荐堆2段加速1928（大CW配444酒可以打一个492加速附魔或者直接2个加速紫附魔，小CW可能要多打一个）");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "易筋配装",matchType = MatchType.TEXT_EQUALS)
    public void getYiJingPeiZhuang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/bps/40194\n" +
                        "章节六 基本理论以及属性收益");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "易筋宏",matchType = MatchType.TEXT_EQUALS)
    public void getYiJingMacro(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/bps/40194\n" +
                        "无脑一键宏（一键宏 醍醐在循环里可删，擒龙手动）\n" +
                        "/cast [qidian>2] 罗汉金身 \n" +
                        "/cast [qidian>2] 拿云式 \n" +
                        "/cast [qidian>2] 韦陀献杵\n" +
                        "/cast 醍醐灌顶\n" +
                        "/cast 横扫六合\n" +
                        "/cast [qidian>1] 守缺式\n" +
                        "/cast 普渡四方\n" +
                        "心诤一键宏（建议配合大附魔使用）\n" +
                        "/cast [qidian>2] 罗汉金身\n" +
                        "/cast [qidian>2] 拿云式\n" +
                        "/cast [qidian>2] 韦陀献杵\n" +
                        "/cast [buff:擒龙诀|qidian=2&buff:罗汉金身] 守缺式\n" +
                        "/cast 普渡四方\n" +
                        "\n" +
                        "纷纭辅助宏 （配合千斤坠辅助宏/cast 千斤坠）\n" +
                        "/cast [nobuff:泥犁之狱&qidian>2] 罗汉金身\n" +
                        "/cast [buff:泥犁之狱] 韦陀献杵\n" +
                        "/cast [qidian>2] 拿云式\n" +
                        "/cast [qidian>2] 韦陀献杵\n" +
                        "/cast 守缺式\n" +
                        "/cast 普渡四方");
        event.getGroup().sendBlocking(message);
    }
}
