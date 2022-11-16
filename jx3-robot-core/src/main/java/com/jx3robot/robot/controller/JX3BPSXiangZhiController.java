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
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Paths;

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
                "奶歌快速入门\n" +
                        "奶歌白皮书\n" +
                        "奶歌奇穴\n" +
                        "奶歌如何提升减伤意识\n" +
                        "奶歌如何帮助团队提高伤害\n" +
                        "奶歌\"出警\"与\"反甩锅\"\n" +
                        "奶歌加速\n" +
                        "奶歌配装\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶歌白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiWhitePaper(MiraiGroupMessageEvent event){
        Message message = Text.of("奶歌白皮书:https://www.jx3box.com/bps/27962");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶歌奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiQiXue(MiraiGroupMessageEvent event){
        Message message = Text.of("盾歌奇穴：蔚风 秋鸿 争簇 绿绮 寒酒 犹香 笙簧 绝唱 相依 庄周梦 游羽 桑柔\n" +
                "血歌奇穴（25人本不推荐打血歌）：红隙 秋鸿 争簇 流音 超然 自赏 寸光阴 行云 流霜 棋宫 掷杯 无尽藏");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶歌如何提升减伤意识",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiContent1(MiraiGroupMessageEvent event){
        Message message = Text.of("奶歌如何提升减伤意识:https://www.jx3box.com/bps/20424");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶歌如何帮助团队提高伤害",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiContent2(MiraiGroupMessageEvent event){
        Message message = Text.of("奶歌如何帮助团队提高伤害:https://www.jx3box.com/bps/34089");
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "奶歌配装",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiPeiZhuang(MiraiGroupMessageEvent event){
        InputStream fileInputStream = FileUtil.getFileInputStream("/Image/XiangZhi/相知配装.png");

        Image image = event.getBot().uploadImageBlocking(Resource.of(fileInputStream));
        Text textMessage = Text.of("奶歌配装\n先出啥要啥，一定优先满足好加速阈值！！！根据自己的运气、财力去抉择\n" +
                "门派四件套必备（手脚必有其他部位三选二）\n大附魔随意，裤子打玉简\n小附魔加速没满打加速，加速满了打会心/治疗\n五彩石打会疗会效（内功/阴性的都可以）\n" +
                "给一个配装图大概参考\n");
        Messages messages = Messages.toMessages(textMessage, image);
        event.getGroup().sendBlocking(messages);
    }
    @Listener
    @Filter(value = "奶歌\"出警\"与\"反甩锅\"",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiContent3(MiraiGroupMessageEvent event){
        Message message = Text.of("奶歌\"出警\"与\"反甩锅\":https://www.jx3box.com/bps/22862");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶歌加速",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiSpeed(MiraiGroupMessageEvent event){
        Message message = Text.of("奶歌加速\n盾歌只推荐6296/8780档，其他通通不行\n" +
                "两种加速影响盾厚度、盾覆盖率、救急、手感\n" +
                "破盾频繁的boos建议走8780，不频繁的走6296\n" +
                "血歌唯一推荐8780");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶歌快速入门",matchType = MatchType.TEXT_EQUALS)
    public void getXiangZhiintroduction(MiraiGroupMessageEvent event){
        Message message = Text.of("盾歌优先套盾补盾，贴不上盾就帮刷血；血歌刷好四队双hot");
        event.getGroup().sendBlocking(message);
    }
}
