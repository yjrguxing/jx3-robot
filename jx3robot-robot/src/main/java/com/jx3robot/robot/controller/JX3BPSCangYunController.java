package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

/**剑三分山职业问答控制层
 * @author psyduck
 * @Date 2022/5/26 19:49 
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSCangYunController {
    @Listener
    @Filter(value = "分山",matchType = MatchType.TEXT_EQUALS)
    public void getFenShan(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "分山PVE指南\n" +
                        "分山配装\n" +
                        "分山DPS计算器\n" +
                        "分山木桩视频\n" +
                        "分山宏\n" +
                        "分山试炼之地\n" +
                        "分山浪客行\n" +
                        "分山设置");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "分山设置",matchType = MatchType.TEXT_EQUALS)
    public void getFenShanOption(MiraiGroupMessageEvent event){
        Message message = Text.of("按键精灵和鼠标宏教程是焚影的，感谢陆寻寻赞助。\n" +
                "按键精灵设置教程@陆寻寻\n" +
                "https://docs.qq.com/doc/DUWVDVXVyYWN4cWRu\n" +
                "罗技鼠标宏设置教程@陆寻寻\n" +
                "https://docs.qq.com/doc/DUUxsbHlBZkJzelp3\n" +
                "雷蛇鼠标宏设置教程@陆晚洲\n" +
                "https://docs.qq.com/doc/DSXNTeGdDaXdUY2dR");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "分山PVE指南",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "分山配装",matchType = MatchType.TEXT_EQUALS)
    public void getFenShanWhitePaper(MiraiGroupMessageEvent event){
        Message message = Text.of("江湖无限分山PVE指南@神光毓逍遥\n" +
                "https://www.jx3box.com/bps/38688");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "分山DPS计算器",matchType = MatchType.TEXT_EQUALS)
    public void getFenShanCalculator(MiraiGroupMessageEvent event){
        Message message = Text.of("江湖无限分山DPS计算器@神光毓逍遥\n" +
                "https://www.jx3box.com/tool/40019");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "分山木桩视频",matchType = MatchType.TEXT_EQUALS)
    public void getFenShanMuZhuang(MiraiGroupMessageEvent event){
        Message message = Text.of("非橙武木桩进阶@神光毓逍遥\n" +
                "https://b23.tv/YLjtDFs\n" +
                "非橙武木桩循环参考@齿樱\n" +
                "https://b23.tv/NqvZ2Ha\n" +
                "橙武木桩循环参考@齿樱\n" +
                "https://b23.tv/lHnCwx7");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "分山宏",matchType = MatchType.TEXT_EQUALS)
    public void getFenShanMacro(MiraiGroupMessageEvent event){
        Message message = Text.of("绝云非橙武、橙武一键宏@燕殒\n" +
                "https://www.jx3box.com/macro/31682\n" +
                "绝云非橙武一键宏@千沧\n" +
                "https://www.jx3box.com/macro/39631\n" +
                "绝云非橙武、橙武辅助宏@神光毓逍遥\n" +
                "https://www.jx3box.com/macro/39602");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "分山试炼",matchType = MatchType.TEXT_EQUALS)
    public void getFenShanShiLian(MiraiGroupMessageEvent event){
        Message message = Text.of("试炼之地80层日常@阿猛\n" +
                "https://www.bilibili.com/video/BV1D5411R758\n" +
                "试炼之地冲层心得@阿猛\n" +
                "https://www.jx3box.com/bps/35190");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "分山浪客行",matchType = MatchType.TEXT_EQUALS)
    public void getFenShanVagabond(MiraiGroupMessageEvent event){
        Message message = Text.of("分山浪客行自强@兔猫\n" +
                "https://www.jx3box.com/bps/39684");
        event.getGroup().sendBlocking(message);
    }
}
