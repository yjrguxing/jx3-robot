package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

/**
 * 剑三凌雪阁职业问答控制层
 * @author psyduck
 * @Date 2022/5/25 23:27
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSLingXueGeController {

    private Long lastRequestTime = System.currentTimeMillis();
    private Long ms = Long.valueOf(10 * 1000);
    private StringBuilder diffms = new StringBuilder("0");

    @Listener
    @Filter(value = "凌雪阁",matchType = MatchType.TEXT_EQUALS)
    public void getLingXueGe(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of(
                    "凌雪白皮书\n" +
                            "凌雪计算器\n" +
                            "凌雪宏百科\n" +
                            "凌雪赛季指北\n" +
                            "凌雪双乱木桩视频\n");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "凌雪白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getLingXueGeWhitePaper(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("魔盒地址：https://www.jx3box.com/bps/38420\n" +
                    "适用对象：想深入理解本门派的凌雪阁同门。\n" +
                    "凌雪PVE——从入门到入土的详细攻略。\n" +
                    "点击开头目录可直接跳转至对应章节。");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "凌雪计算器",matchType = MatchType.TEXT_EQUALS)
    public void getLingXueGeCalculator(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("魔盒地址：https://www.jx3box.com/tool/22906\n" +
                    "适用对象：在配装时希望获得数据协助的凌雪阁同门。\n" +
                    "注：如果你是第一次使用，建议仔细阅读使用说明。");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "凌雪宏百科",matchType = MatchType.TEXT_EQUALS)
    public void getLingXueGeMacro(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("魔盒地址：https://www.jx3box.com/macro/19704\n" +
                    "适用对象：新入门的凌雪阁玩家（和懒鬼）。\n" +
                    "注：对于进阶凌雪，请翻阅该作者发布的无损辅助宏。");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "凌雪赛季指北",matchType = MatchType.TEXT_EQUALS)
    public void getLingXueGeSaiJiZhiBei(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("魔盒地址：https://www.jx3box.com/bps/39928\n" +
                    "适用对象：对凌雪有个基本了解，想直接抄新赛季作业的凌雪阁同门。");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "凌雪双乱木桩视频",matchType = MatchType.TEXT_EQUALS)
    public void getLingXueGeVedio(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("魔盒地址：https://www.jx3box.com/bps/40522\n" +
                    "适用对象：有手法学习需求的凌雪阁同门。\n" +
                    "注：装备皆为YX雷域毕业装备，意在展示双乱循环的手法，希望能为你们练习循环带来帮助。");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    /**
     * 需要节流返回true<br/>
     * @author psyduck
     * @date 2022/5/25 10:07
     * @return boolean true为需要节流 false则不需要
     */
    public boolean throttle(){
        long diffms = System.currentTimeMillis() - lastRequestTime;
        long second = 10 - (diffms % 1000 == 0 ? diffms / 1000 : diffms / 1000 + 1);
        if(diffms < ms){
            this.diffms.setCharAt(0,String.valueOf(second).charAt(0));
            return true;
        }
        lastRequestTime = System.currentTimeMillis();
        return false;
    }
}
