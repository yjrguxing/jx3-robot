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
 * 剑三奶毒职业问答控制层
 * @author psyduck
 * @Date 2022/5/26 19:59 
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSNaiDuController {

    @Listener
    @Filter(value = "奶毒",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "补天",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "补天诀",matchType = MatchType.TEXT_EQUALS)
    public void getNaiDu(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "奶毒入门\n" +
                        "奶毒白皮书\n" +
                        "奶毒计算器\n" +
                        "奶毒奇穴\n" +
                        "奶毒配装");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "奶毒入门",matchType = MatchType.TEXT_EQUALS)
    public void getNaiDuGoDoor(MiraiGroupMessageEvent event){
        Message message = Text.of("设置剑心插件一件选择最低血量队友，挂按键，无脑冰蚕，想深入学习就去白皮书了解醉舞手法。\n" +
                "女娲与蝶池、千蝶绑定。爆发循环为女娲蝶池碧蝶引三瞬发。在茗伊插件中目标监控内监控“碧蝶”此buff，蝶池炸完后图标碧蝶buff变暗再衔接其他技能。\n" +
                "Aoe伤害生效女娲蝶池，或查看bdm，aoe技能前预留女娲蝶池。有女娲没蝶池拉千蝶。\n" +
                "蛊惑给t，无脑种菜，鼎好就落。");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶毒白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getNaiDuWhitePaper(MiraiGroupMessageEvent event){
        Message message = Text.of("奶毒白皮书:https://www.jx3box.com/bps/39309");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "奶毒计算器",matchType = MatchType.TEXT_EQUALS)
    public void getNaiDuCalculator(MiraiGroupMessageEvent event){
        Message message = Text.of("奶毒计算器:https://origin.jx3box.com/bps/41090");
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "奶毒奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getNaiDuQiXue(MiraiGroupMessageEvent event){
        Text message1 = Text.of("纯单体掉血和奶npcboss");
        Text message2 = Text.of("Aoe掉血boss");
        Image naiDuQiXue1 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/NaiDu/奶毒奇穴1.png")));
        Image naiDuQiXue2 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/NaiDu/奶毒奇穴2.png")));
        Image naiDuQiXue3 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/NaiDu/奶毒奇穴3.png")));
        Image naiDuQiXue4 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/NaiDu/奶毒奇穴4.png")));
        Image naiDuQiXue5 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/NaiDu/奶毒奇穴5.png")));
        Text message3 = Text.of("穿透aoe较多boss可选择将绮栊换织心。持续性掉血boss固定蛊梦绮栊。其他aoe模型的boss可视自身习惯选择冰蚕流。有cw全程织心。");
        Messages messages = Messages.toMessages(
                message1,
                naiDuQiXue1,
                naiDuQiXue2,
                message2,
                naiDuQiXue3,
                naiDuQiXue4,
                naiDuQiXue5,
                message3);
        event.getGroup().sendBlocking(messages);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "奶毒配装",matchType = MatchType.TEXT_EQUALS)
    public void getNaiDuPeiZhuang(MiraiGroupMessageEvent event){
        Text message1 = Text.of("奶毒是理论的纯疗战神，拥有绝灵女娲100%和灵蛇50%基础疗效加成。\n" +
                "纯疗配装搭配碧蝶会心buff，可以让二跳蝶池的爆发治疗拉满。\n" +
                "词条方面根骨＞＞基础疗效＞＞会心＞会效。\n" +
                "也可以按照自己的理解和习惯怼会心。\n" +
                "加速满达到醉舞满速阙值。\n" +
                "视赛季boss掉血模型也可以低加速增加奶毒爆发治疗，比如白帝赛季主要靠蝶池和千蝶抬血。\n" +
                "沐风必要。\n" +
                "两套配装里面觉得会心或纯疗不符合自身习惯，就把散件互换就行。");
        Image naiDuPeiZhuang1 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/NaiDu/奶毒配装1.png")));
        Image naiDuPeiZhuang2 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/NaiDu/奶毒配装2.png")));
        Messages messages = Messages.toMessages(message1, naiDuPeiZhuang1, naiDuPeiZhuang2);
        event.getGroup().sendBlocking(messages);
    }
}
