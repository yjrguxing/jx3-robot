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

import java.io.InputStream;

/**
 * 剑三相知职业问答控制层
 * @author psyduck
 * @Date 2022/5/24 21:23
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSXiangZhiController {

    @Listener
    @Filter(value = "相知",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "奶歌",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhi(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "相知通用攻略\n" +
                        "十人副本血鸽攻略\n" +
                        "25人普通西津渡相知攻略\n" +
                        "25YX西津渡盾鸽攻略\n" +
                        "PVP奶歌入门攻略");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "相知通用攻略",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiWhitePaper(MiraiGroupMessageEvent event){
        Message message = Text.of("相知通用攻略 https://www.jx3box.com/bps/47502");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "十人副本血鸽攻略",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiQiXue(MiraiGroupMessageEvent event){
        Message message = Text.of("十人副本血鸽攻略 https://www.jx3box.com/bps/47976");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "25人普通西津渡相知攻略",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiContent1(MiraiGroupMessageEvent event){
        Message message = Text.of("25人普通西津渡相知攻略https://www.jx3box.com/bps/45896");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "25YX西津渡盾鸽攻略",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiContent2(MiraiGroupMessageEvent event){
        Message message = Text.of("25YX西津渡盾鸽攻略 https://www.jx3box.com/bps/47905");
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "PVP奶歌入门攻略",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiPeiZhuang(MiraiGroupMessageEvent event){
        InputStream fileInputStream = FileUtil.getFileInputStream("/Image/XiangZhi/相知配装.png");

        Image image = event.getBot().uploadImageBlocking(Resource.of(fileInputStream));
        Text textMessage = Text.of("PVP奶歌入门攻略 https://www.jx3box.com/bps/42618");
        Messages messages = Messages.toMessages(textMessage, image);
        event.getGroup().sendBlocking(textMessage);
    }
//    @Listener
//    @Filter(value = "奶歌\"出警\"与\"反甩锅\"",matchType = MatchType.TEXT_EQUALS)
//    public void getXiangZhiContent3(MiraiGroupMessageEvent event){
//        Message message = Text.of("奶歌\"出警\"与\"反甩锅\":https://www.jx3box.com/bps/22862");
//        event.getGroup().sendBlocking(message);
//    }
//    @Listener
//    @Filter(value = "奶歌加速",matchType = MatchType.TEXT_EQUALS)
//    public void getXiangZhiSpeed(MiraiGroupMessageEvent event){
//        Message message = Text.of("奶歌加速\n盾歌只推荐6296/8780档，其他通通不行\n" +
//                "两种加速影响盾厚度、盾覆盖率、救急、手感\n" +
//                "破盾频繁的boos建议走8780，不频繁的走6296\n" +
//                "血歌唯一推荐8780");
//        event.getGroup().sendBlocking(message);
//    }
//    @Listener
//    @Filter(value = "奶歌快速入门",matchType = MatchType.TEXT_EQUALS)
//    public void getXiangZhiintroduction(MiraiGroupMessageEvent event){
//        Message message = Text.of("盾歌优先套盾补盾，贴不上盾就帮刷血；血歌刷好四队双hot");
//        event.getGroup().sendBlocking(message);
//    }
}
