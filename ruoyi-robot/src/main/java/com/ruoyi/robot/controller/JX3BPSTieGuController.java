package com.ruoyi.robot.controller;

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
 * 剑三铁骨职业问答控制层
 * @author psyduck
 * @Date 2022/5/26 22:09
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSTieGuController {
    @Listener
    @Filter(value = "铁骨",matchType = MatchType.TEXT_EQUALS)
    public void getTieGu(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "铁骨指南\n" +
                        "铁骨配装\n" +
                        "铁骨计算器\n" +
                        "铁骨宏");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "铁骨指南",matchType = MatchType.TEXT_EQUALS)
    public void getTieGuZhiNan(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "团本综合：https://www.jx3box.com/bps/36786 @山岚\n" +
                        "试炼之地：https://www.jx3box.com/bps/38055 @霖昕\n" +
                        "振奋：https://www.jx3box.com/bps/39811 @柳慕九\n" +
                        "特殊武器：https://www.jx3box.com/bps/21105 @叶小雪");
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "铁骨配装",matchType = MatchType.TEXT_EQUALS)
    public void getTieGuPeiZhuang(MiraiGroupMessageEvent event){
        Image image1 = event.getBot().uploadImageBlocking(Resource.of(new File("ruoyi-robot/src/main/resources/Image/TieGu/铁骨配装1.png")));
        Image image2 = event.getBot().uploadImageBlocking(Resource.of(new File("ruoyi-robot/src/main/resources/Image/TieGu/铁骨配装2.png")));
        Image image3 = event.getBot().uploadImageBlocking(Resource.of(new File("ruoyi-robot/src/main/resources/Image/TieGu/铁骨配装3.png")));
        Image image4 = event.getBot().uploadImageBlocking(Resource.of(new File("ruoyi-robot/src/main/resources/Image/TieGu/铁骨配装4.png")));
        Messages messages = Messages.toMessages(image1, image2, image3, image4);
        event.getGroup().sendBlocking(messages);
    }
    @Listener
    @Filter(value = "铁骨计算器",matchType = MatchType.TEXT_EQUALS)
    public void getTieGuCalculator(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "输出：https://www.jx3box.com/tool/40699 @霖昕\n" +
                        "振奋：https://www.jx3box.com/tool/22890 @柳慕九");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "铁骨宏",matchType = MatchType.TEXT_EQUALS)
    public void getTieGuMacro(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "常规振奋及玉简寒甲宏：https://www.jx3box.com/macro/35111 @柳慕九&暮春春\n" +
                        "主T及橙武寒甲宏：https://www.jx3box.com/macro/40795 @山岚");
        event.getGroup().sendBlocking(message);
    }
}
