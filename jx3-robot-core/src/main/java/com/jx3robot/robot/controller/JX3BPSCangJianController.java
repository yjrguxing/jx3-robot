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

@RestController
public class JX3BPSCangJianController {
    @Listener
    @Filter(value = "藏剑",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "问水诀",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "山居剑意",matchType = MatchType.TEXT_EQUALS)
    public void getCangjian(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "藏剑宏\n" +
                    "藏剑加速\n" +
                    "藏剑秘籍\n" +
                    "藏剑配装\n" +
                    "藏剑计算器\n" +
                    "藏剑常见问题\n" +
                    "藏剑PVE打法\n");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "藏剑宏",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianMacro(MiraiGroupMessageEvent event){
        Text of = Text.of("https://www.jx3box.com/macro/21622\n" +
                "轻剑宏：\n" +
                "/cast [nearby_enemy>0&skill:18682] 九溪弥烟\n" +
                "/cast 玉虹贯日\n" +
                "注：手动黄龙啸日。\n" +
                "\n" +
                "映波重剑宏：\n" +
                "/cast [bufftime:雾锁>1.3&nobuff:凤鸣&nobuff:麟战] 听雷\n" +
                "/cast [bufftime:雾锁>1.3&buff:麟战|buff:夜雨] 云飞玉皇\n" +
                "/cast 夕照雷峰\n" +
                "奇穴：[淘尽][清风][夜雨][景行][映波锁澜][怜光][层云][撼岳][雾锁][残雪][如风][飞来闻踪]\n" +
                "\n" +
                "造化重剑宏：\n" +
                "/cast [buff:云景|bufftime:雾锁>1.3|buff:夜雨] 云飞玉皇\n" +
                "/cast [rage<10|buff:云栖松&bufftime:雾锁>4] 听雷\n" +
                "/cast 夕照雷峰\n" +
                "奇穴：[淘尽][清风][夜雨][景行][造化][怜光][层云][撼岳][雾锁][碧归][如风][飞来闻踪]\n" +
                "注：40会心以下两本云飞减读条秘籍\n" +
                "造化视频：https://www.bilibili.com/video/BV1FV4y1G7gd");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "藏剑加速",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianSpeed(MiraiGroupMessageEvent event){
        Text of = Text.of("点如风奇穴：1131\n" +
                "110CW麟战可以搭配一个加速附魔或者家园酒\n" +
                "120CW不用附魔\n" +
                "其他武器两个加速附魔\n");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "藏剑秘籍",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianBook(MiraiGroupMessageEvent event){
        Text of = Text.of("九溪弥烟：2本范围+任意\n" +
                "黄龙吐翠：2本剑气+任意 （驱散秘籍点出备用）\n" +
                "云飞玉皇：①夜雨：3伤害1会心（会心低于40用两本减读条）   ②岱宗：2伤害2读条\n" +
                "夕照雷峰：1读条1会心2伤害\n" +
                "风来吴山：3伤害1会心\n" +
                "听雷：2伤害2会心\n" +
                "啸日：1剑气+任意\n" +
                "云栖松：2CD1回气1回血\n");
        event.getGroup().sendBlocking(of);
    }

    @SneakyThrows
    @Listener
    @Filter(value = "藏剑配装",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianPeiZhuang(MiraiGroupMessageEvent event){
        InputStream Image1FileInputStream = FileUtil.getFileInputStream("/Image/CangJian/藏剑配装1.png");
        InputStream Image2FileInputStream = FileUtil.getFileInputStream("/Image/CangJian/藏剑配装2.png");
        InputStream Image3FileInputStream = FileUtil.getFileInputStream("/Image/CangJian/藏剑配装3.png");
        Image image1 = event.getBot().uploadImageBlocking(Resource.of(Image1FileInputStream));
        Image image2 = event.getBot().uploadImageBlocking(Resource.of(Image2FileInputStream));
        Image image3 = event.getBot().uploadImageBlocking(Resource.of(Image3FileInputStream));
        Messages messages = Messages.toMessages(image1, image2, image3);
        event.getGroup().sendBlocking(messages);
    }

    @Listener
    @Filter(value = "藏剑计算器",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianCalculator(MiraiGroupMessageEvent event){
        Text of = Text.of("作者青墨白宣：https://www.jx3box.com/tool/31129\n" +
                "作者留情@梦江南：https://www.jx3box.com/tool/40179\n");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "藏剑常见问题",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianQA(MiraiGroupMessageEvent event){
        Text of = Text.of("https://www.jx3box.com/bps/41445 持续更新");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "藏剑PVE打法",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianPVE(MiraiGroupMessageEvent event){
        Text of = Text.of("https://www.jx3box.com/bps/46493  藏剑PVE循环本质解析——教你如何找到正确的输出手法\n" +
                "https://www.jx3box.com/bps/45240  【横刀断浪】体服藏剑PVE探索\n");
        event.getGroup().sendBlocking(of);
    }


}
