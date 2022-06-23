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
 * 剑三铁牢职业问答
 * @author psyduck
 * @Date 2022/5/30 13:31
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSTieLaoController {

    @Listener
    @Filter(value = "铁牢",matchType = MatchType.TEXT_EQUALS)
    public void getTieLao(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "铁牢一键宏\n" +
                        "铁牢配装\n" +
                        "铁牢奇穴\n" +
                        "铁牢秘籍\n" +
                        "铁牢附魔\n" +
                        "铁牢河阳之战\n" +
                        "铁牢白皮书\n" +
                        "铁牢计算器\n" +
                        "铁牢属性\n" +
                        "铁牢阵眼\n" +
                        "铁牢小药\n" +
                        "铁牢实战视频\n" +
                        "PVE：铁牢群970673170");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "铁牢一键宏",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoMacro(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "常规一键通用：\n" +
                        "/cast [life<0.2] 啸如虎\n" +
                        "/cast [rage<4] 龙吟\n" +
                        "/cast 龙牙\n" +
                        "/cast [skill:6781&rage<3] 灭\n" +
                        "/cast 穿云\n" +
                        "群攻：\n" +
                        "/cast [life<0.2] 啸如虎\n" +
                        "/cast 战八方\n" +
                        "原文链接：https://www.jx3box.com/macro/20725");
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "铁牢配装",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoPeiZhuang(MiraiGroupMessageEvent event){
        Image image1 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/TieLao/铁牢配装1.png")));
        Image image2 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/TieLao/铁牢配装2.png")));
        Image image3 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/TieLao/铁牢配装3.png")));
        Messages message = Messages.toMessages(image1, image2, image3);
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "铁牢奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoQiXue(MiraiGroupMessageEvent event){
        Text message1 = Text.of("1.常规纯坦奇穴\n" + "此为纯坦主T流派的通用奇穴，适合单拉。利用双突+御作为常驻减伤，大山和虎作为应急减伤。\n");
        Image image1 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/TieLao/奇穴1.png")));
        Text message2 = Text.of("\n2.常规输出奇穴\n" + "此为输出主T流派的通用奇穴，保留铁牢基本增益。力破万钧在通常情况下一般点不出来，所以不做考虑。\n");
        Image image2 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/TieLao/奇穴2.png")));
        Text message3 = Text.of("\n3.群拉/群攻奇穴\n" + "此为铁牢群攻奇穴，使用战八方作为主要群体仇恨输出技能，烈雷作为群体强仇。目前适用于所有需要群拉的场合，包括河阳老三。\n");
        Image image3 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/TieLao/奇穴3.png")));
        Messages message = Messages.toMessages(message1,image1,message2, image2,message3, image3);
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "铁牢秘籍",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoMiJi(MiraiGroupMessageEvent event){
        Text message = Text.of("1.秘籍仅为副本推荐点法，其它玩法（单刷，pvp等）可能不适用\n" +
                "2.所有减调息秘籍和效果秘籍为高优先级。\n" +
                "3.推荐秘籍不为绝对且唯一，如果你有自己的理解可以不用参考推荐秘籍。\n" +
                "\n" +
                "【穿云】1调息 2伤害 1会心\n" +
                "【龙吟】1调息 3伤害\n" +
                "【灭】1调息 2伤害 1会心\n" +
                "【龙牙】2伤害 2会心\n" +
                "【疾如风】2调息 2效果\n" +
                "【守如山】3调息 1持续\n" +
                "【啸如虎】3调息 1持续\n" +
                "【突】2解控 1距离 1伤害\n" +
                "【战八方】1个数 2伤害 1距离\n" +
                "（其中河阳老三战八方推荐1距离，1消耗，2伤害）");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "铁牢附魔",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoFuMo(MiraiGroupMessageEvent event){
        Text message = Text.of("帽子：急速/破招\n" +
                "上衣：御劲/闪避/体质\n" +
                "腰带：御劲/闪避/体质\n" +
                "护手：无双/仇恨\n" +
                "裤子：无双/仇恨\n" +
                "鞋子：急速/破招\n" +
                "项链：御劲/体质\n" +
                "腰坠：体质\n" +
                "戒指：破招 \n" +
                "暗器：急速/外功破防\n" +
                "武器：仇恨/龙血磨石");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "铁牢河阳之战",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoHeYang(MiraiGroupMessageEvent event){
        Text message = Text.of("【江湖无限】大型天策T河阳之战PVE铁牢攻略\n" +
                "https://www.jx3box.com/bps/38551");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "铁牢白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoWhitePaper(MiraiGroupMessageEvent event){
        Text message = Text.of("天策T铁牢PVE向白皮书 (入坑指南)\n" +
                "https://www.jx3box.com/bps/20925");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "铁牢计算器",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoCalculator(MiraiGroupMessageEvent event){
        Text message = Text.of("4T配装计算器https://www.jx3box.com/tool/23935\n" +
                "铁牢输出主T计算器http://jx3tank.com/");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "铁牢属性",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoShuXing(MiraiGroupMessageEvent event){
        Text message = Text.of("体质优先，不要内防。建议在外防满足40以后选择闪避或招架装备。闪避则是越多越好。\n" +
                "御劲需求：9  加速需求：1928、4026、6296");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "铁牢阵眼",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoZhenYan(MiraiGroupMessageEvent event){
        Text message = Text.of("防御流派：铁骨阵>明尊阵\n" +
                "输出流派：剑纯阵、田螺阵、凌雪阵");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "铁牢五彩石",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoWuCaiShi(MiraiGroupMessageEvent event){
        Text message = Text.of("划水副T流派：随意\n" +
                "纯坦主T流派：体御外/体闪外/精简减伤/精简体质\n" +
                "输出主T流派：会破会/精简体质\n" +
                "\n" +
                "精简五彩石价格比较昂贵，平民玩家可以不考虑。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "铁牢小药",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoXiaoYao(MiraiGroupMessageEvent event){
        Text message = Text.of("辅助类食品：体质\n" +
                "辅助类药品：体质\n" +
                "增强类食品：破招/会心/急速\n" +
                "增强类药品：破招/会心/急速\n" +
                "依据自身现有属性合理选择。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "铁牢实战视频",matchType = MatchType.TEXT_EQUALS)
    public void getTieLaoVideo(MiraiGroupMessageEvent event){
        Text message = Text.of("【剑网三】英雄河阳之战 天策T视角\n" +
                "https://www.bilibili.com/video/BV1kv4y1K72k/");
        event.getGroup().sendBlocking(message);
    }


}
