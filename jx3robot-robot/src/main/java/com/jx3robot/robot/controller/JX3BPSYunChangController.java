package com.jx3robot.robot.controller;

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
    public void getYunChang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "奶秀快速入门\n" +
                        "奶秀攻略\n" +
                        "奶秀河阳之战副本攻略\n" +
                        "奶秀奇穴\n" +
                        "奶秀加速\n" +
                        "奶秀属性\n" +
                        "奶秀配装");;
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀快速入门",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangGoDoor(MiraiGroupMessageEvent event){
        Message message = message = Text.of("瞬发（上元/翔舞/王母/风袖）接二跳回雪自断，起手翔舞回雪，穿插上元回雪给掉血的人挂上元。\n" +
                "王母是大加，风袖是减伤+大加，繁音是爆发，九微飞花是群加/余寒映日是偏单体爆发。\n" +
                "平时翔舞回雪上元回雪，尽量用上元传染翔舞，单体大掉血风袖，群体大掉血繁音+九微+王母+风袖。\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀攻略",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangGongLue(MiraiGroupMessageEvent event){
        Message message = Text.of("奶秀攻略：https://www.jx3box.com/bps/19902");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀河阳之战副本攻略",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangHeYang(MiraiGroupMessageEvent event){
        Message message = Text.of("奶秀河阳之战副本攻略：https://www.jx3box.com/bps/39751");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangSaiJiZhiBei(MiraiGroupMessageEvent event){
        Message message = Text.of("常规：朝露 盛夏 辞致 瑰姿 乞巧 散余霞 心问 碎冰 霜风 秋深 垂眉 九微飞花/余寒映日\n" +
                "纯群刷：朝露 盛夏 枕上 瑰姿 乞巧 散余霞 晚晴 碎冰 霜风 妍姿 垂眉 九微飞花\n" +
                "纯单体：朝露 盛夏 辞致 瑰姿 乞巧 晚阳/舞霁 心问 碎冰 霜风 秋深 垂眉 余寒映日\n" +
                "驱散：碎冰改跳珠憾玉\n" +
                "小战复：垂眉改璇妗\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶秀加速",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "奶秀属性",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangSpeed(MiraiGroupMessageEvent event){
        Message message = Text.of("江湖无限赛季50-55%会心，8780加速。");
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "奶秀配装",matchType = MatchType.TEXT_EQUALS)
    public void getYunChangPeiZhuang(MiraiGroupMessageEvent event){
        Image image = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/NaiXiu/奶秀配装.png")));
        Text textMessage = Text.of("配装需要满足的条件按照优先级从高到低：8780加速——四件套——\n" +
                "特效腰坠/特效武器——会疗会五彩石。大附魔残卷玉简皆可，实战表现差别不大。\n" +
                "参考配装:\n");
        Messages messages = Messages.toMessages(textMessage, image);
        event.getGroup().sendBlocking(messages);
    }

}
