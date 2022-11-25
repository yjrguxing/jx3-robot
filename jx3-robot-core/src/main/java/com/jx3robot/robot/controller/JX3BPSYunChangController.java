package com.jx3robot.robot.controller;

import com.jx3robot.robot.util.FileUtil;
import lombok.SneakyThrows;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Image;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Messages;
import love.forte.simbot.message.Text;
import love.forte.simbot.resources.Resource;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * 奶秀职业问答
 * @author psyduck
 * @Date 2022/5/26 0:15
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSYunChangController {
    @Listener
    @Filter(value = "奶秀",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "云裳心经",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "云裳",matchType = MatchType.TEXT_EQUALS)
    public void getYunChang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "奶秀快速入门\n" +
                        "奶秀进阶\n" +
                        "奶秀西津渡攻略\n" +
                        "奶秀奇穴\n" +
                        "奶秀加速\n" +
                        "奶秀属性\n" +
                        "奶秀配装");;
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀快速入门",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangGoDoor(MiraiGroupMessageEvent event){
        Message message = message = Text.of("左旋倒数1的时候开始转，cd40s转满持续60s，尽量保证左旋破招覆盖全程，也就是每40-60s补一次左旋，可配合时间轴在20s内调整时机辅助刷血。\n" +
                "瞬发（上元/翔舞/王母/风袖）接二跳回雪自断，提前挂几个翔舞，起手左旋铺开，然后穿插上元回雪给掉血的人挂上元，翔舞快掉没了补翔舞，王母是大加，风袖是减伤+大加，繁音是爆发，九微飞花是群加/余寒映日是偏单体爆发。平时翔舞回雪上元回雪，用上元传染翔舞，单体大掉血风袖，群体大掉血繁音+九微+王母+风袖。\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀西津渡攻略",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangGongLue(MiraiGroupMessageEvent event){
        Message message = Text.of("【横刀断浪】PVE云裳英雄西津渡1-6攻略\n" +
                "https://www.jx3box.com/bps/47873\n" +
                "https://www.jx3box.com/bps/48395");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀进阶",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangHeYang(MiraiGroupMessageEvent event){
        Message message = Text.of("【横刀断浪】PVE云裳职业攻略\n" +
                "https://www.jx3box.com/bps/19902");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangSaiJiZhiBei(MiraiGroupMessageEvent event){
        Message message = Text.of("常规：朝露 盛夏 枕上/辞致 瑰姿 乞巧 散余霞 晚晴/心问 碎冰 妍姿 左旋右转 垂眉 九微飞花\n" +
                "单体奶爆：朝露 盛夏 辞致 瑰姿 乞巧 晚阳/舞霁 心问 碎冰 妍姿 左旋右转（双秀可秋深） 垂眉 余寒映日\n" +
                "驱散：碎冰改跳珠憾玉\n" +
                "小战复：垂眉改璇妗\n" +
                "增益：左旋右转（团本必点）\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀加速",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "奶秀属性",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangSpeed(MiraiGroupMessageEvent event){
        Message message = Text.of("横刀断浪赛季20-25%会心，19316加速。用水特效武器会心会略高，没关系，特效武器更好");
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "奶秀配装",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangPeiZhuang(MiraiGroupMessageEvent event){
        Image image = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/NaiXiu/奶秀配装.png")));
        Text textMessage = Text.of("19316加速——沐风套装——回雪套装——特效腰坠/特效武器——会会疗五彩石。有钱上橙武飞剑妙手没钱不用管。");
        Messages messages = Messages.toMessages(textMessage, image);
        event.getGroup().sendBlocking(messages);
    }

}
