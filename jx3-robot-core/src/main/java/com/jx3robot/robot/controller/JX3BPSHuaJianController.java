package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JX3BPSHuaJianController {

    @Listener
    @Filter(value = "花间",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "万花",matchType = MatchType.TEXT_EQUALS)
    public void getGaiBang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "花间白皮书\n" +
                        "花间进阶\n" +
                        "花间宏\n" +
                        "花间监控\n" +
                        "花间加速\n" +
                        "花间奇穴\n" +
                        "花间属性\n");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "花间白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getHuaJianBaiPiShu(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "花间游白皮书：https://www.jx3box.com/bps/46315\n" +
                        "基础花间游攻略，涵盖基础知识讲解，奇穴说明，循环教学与配装属性收益等内容，适合刚上手花间游的玩家。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "花间进阶",matchType = MatchType.TEXT_EQUALS)
    public void getHuaJianJinJie(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "花间游进阶攻略：https://www.jx3box.com/bps/48180\n" +
                        "进阶花间游攻略，讲解兰钟循环细节内容，对常见问题的解答，对DPS有提升需求的可以查看。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "花间宏",matchType = MatchType.TEXT_EQUALS)
    public void getHuaJianMacro(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "花间游宏：花间游没有一键宏，输出太低，建议多打木桩练手法。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "花间监控",matchType = MatchType.TEXT_EQUALS)
    public void getHuaJianJianKong(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "花间游目标监控：https://www.jx3box.com/jx3dat/47443\n" +
                        "包含一些常用的BUFF监控，使用方法在花间游白皮书第九章节第二小节中茗伊插件集有介绍。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "花间加速",matchType = MatchType.TEXT_EQUALS)
    public void getHuaJianJiaSu(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "花间游加速阈值：95/4241\n" +
                        "95加速为基础加速阈值，适合新手玩家，通常配装中暗器、帽子、鞋子部位打一个加速附魔即可达到，也可以使用家园酿造的女儿红，可以与其他药品叠加。\n" +
                        "4241加速为进阶加速，但是对手法要求比较高，对DPS有需求的玩家请使用该加速阈值。通常使用加速暗器配合三个加速附魔可以达到。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "花间奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getHuaJianTanelt(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "花间游奇穴推荐：\n" +
                        "基础奇穴：弹指 青冠 倚天 踏歌 青歌 雪中行 清流 钟灵 流离 雪弃 焚玉 涓流\n" +
                        "群攻奇穴：弹指 青冠 风烟翠 踏歌 青歌 雪中行 清流 钟灵 流离 雪弃 焚玉 涓流\n" +
                        "大橙武奇穴：烟霞 定式黑白 倚天 踏歌 折花 生风 清流 钟灵 碎玉 丹青 焚玉 涓流\n" +
                        "各奇穴打法请查阅花间游白皮书：https://www.jx3box.com/bps/46315");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "花间属性",matchType = MatchType.TEXT_EQUALS)
    public void getHuaJianShuXing(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "花间游属性收益：目前以破招属性为主要伤害来源，故在装备选择上选择有带破招词条的装备。各个属性收益也会随着配装变化而变化，此处仅提供一个基础属性收益\n" +
                        "攻击力 > 破招 > 无双 > 破防 > 会效 > 元气 ≈ 会心");
        event.getGroup().sendBlocking(message);
    }
}
