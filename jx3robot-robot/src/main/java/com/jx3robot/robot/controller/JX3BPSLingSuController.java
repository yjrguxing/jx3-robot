package com.jx3robot.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

/**
 * 剑三灵素职业问答
 * @author psyduck
 * @Date 2022/5/29 21:00
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSLingSuController {
    @Listener
    @Filter(value = "灵素",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "药奶",matchType = MatchType.TEXT_EQUALS)
    public void getLingSu(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "药奶入门\n" +
                        "药奶白皮书\n" +
                        "药奶奇穴\n" +
                        "药奶循环\n" +
                        "药奶畅和\n" +
                        "药奶驱散\n" +
                        "药奶NPC治疗\n" +
                        "药奶飘黄\n" +
                        "药奶香稠\n" +
                        "药奶配伍\n" +
                        "药奶同梦\n" +
                        "药奶配装\n" +
                        "药奶秘籍\n" +
                        "药奶气劲");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶入门",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuGoDoor(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "常规循环为：2白芷 1赤芍  人群银光照雪（赤芍好了就打）\n" +
                        "日常循环中可龙葵自苦（非同梦）对齐当归四逆释放，即打当归前先用龙葵+赤芍清温保证当归药性不溢出\n" +
                        "想深入学习可去白皮书了解不同手法循环的不同适用地点。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuWhitePaper(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/bps/30017");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuQiXue(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "常用奇穴为【反佐】【月见】【不染】【素柯/韶时】【畅和】【忘忧/挂雨】【晴柔/同梦】【飘黄】【配伍/幽姿/香稠】【决明/独活】【莲池/拂怜】【百药/卫矛】（仅供参考）\n" +
                        "请根据boss及团队配置调整");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶循环",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuXunHuan(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "温性循环（仅为举例）\n" +
                        "① 白 白（开）赤芍（关）\n" +
                        "② 赤芍（开）当归 赤芍（关）\n" +
                        "③ 当归（开）赤芍 龙葵（关）\n" +
                        "\n" +
                        "寒性循环（仅为举例）\n" +
                        "① 5寒\n" +
                        "有aoe：（开）当归 （关）赤芍 \n" +
                        "无aoe： 赤芍（开）白 白（关）\n" +
                        "② 3寒\n" +
                        "（开）白 白 （关）赤芍  —— 目的：保持身上3寒 等当归CD\n" +
                        "③ 1寒\n" +
                        "龙葵 赤芍（开）当归（关）赤芍\n" +
                        "④ 爆发：（开）百药 当归 / 七情 （关）");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶畅和",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuChangHe(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "寒性：千枝绽蕊 - 当归四逆 / 七情和合 / 白芷含芳 - 千枝伏藏 \n" +
                        "温性：千枝绽蕊 - 赤芍寒香 / 龙葵自苦 / 七情和合 - 千枝伏藏\n" +
                        "简单来讲，就是在每一个触发中和的技能前开千枝，后续补充药性的过程中关千枝，以达到控蓝与中和更多治疗的目的。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶驱散",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuQuSan(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "点出奇穴[鬼卿]后，使技能[当归四逆]附带驱散效果\n" +
                        "点出奇穴[辞零]后，使技能[银光照雪]附带驱散效果（较推荐）\n" +
                        "[鬼卿]和[辞零]一起点，[银光照雪]变成需对面向的单驱，[当归四逆]变为群驱");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶NPC治疗",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuNPC(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "奇穴默认点[韶时]\n①针对治疗单一目标（如狼神殿老三迷乱之奴、傲龙岛老六朱雀内场）\n" +
                        "[青圃着尘] ＞ [释冰]银光 ＞ 当归四逆 ＞ 银光照雪 ＞ 赤芍寒香hot ＞ [幽姿]白芷 ＞ 赤芍寒香首跳\n" +
                        "可参考手法：赤芍-银光-赤芍-当归-白芷  /  赤芍-青圃  /  白芷（死读）\n" +
                        "②针对治疗人群与NPC抱团目标（如傲龙岛老四尹青羲—— 若炸赤则不点[月见]保证银光为单体技能）\n" +
                        "可参考手法：赤芍-银光-赤芍-白芷（须奶团时可当归和赤芍触发中和，否则等赤芍hot掉完或银光好了在补新赤芍）");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶飘黄",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuPiaoHuang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "飘黄所附加的伤害与目标属性有关，受目标无双、破防、会心、会效、加速率影响，一个人极限只能享受11次飘黄加成（蓬莱物化） 。\n" +
                        "因此我们在使用这个技能时，在不影响最终落草次数的情况下，最好能对齐团队一些爆发技能释放，比如天策T的[号令三军]，比如明教T的[朝圣言]等。");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶香稠",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuXiangChou(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "①为Tbuff所服务，给输出T打增益，注意的是这种情况下，赤芍主动除主T外最多可外挂一个，否则就会有断增益的风险\n" +
                        "②为精简多血量少的团员使用，在即将受到大量AOE前给目标挂赤芍hot增血，极限可挂3人");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶配伍",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuPeiWu(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "配伍的全属性加成能同时提高根骨、元气、力道、身法主属性，由于灵素中和在友方目标血限为100%时判定机制为只对小队或团队第一队第一个目标生效，由此演化一队一稳定配伍增益");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶同梦",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuTongMeng(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "①非清盾AOE前贴盾去低消伤害保奶歌盾（如雷域老二 歃血冥刃 / 河阳老二 暗影蝠击）\n" +
                        "②连续非清盾伤害模型中贴盾减轻奶妈瞬间治疗压力（如雷域老五 泉映千山  / 河阳老三 撕裂回旋）");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶配装",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuPeiZhuang(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "装备选择方面，面板治疗和会心数值的成长走势呈正比，因此建议在满足限定加速后主要去堆会心数值，套装优先必须满足效果“中和加成”，建议优先选择衣服和鞋子套装\n" +
                        "散件上腰带和护手可平替、下装和衣服可平替、首饰（项链、腰坠、戒指）可平替，头和暗器为单独属性，视当前配装自由选择");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶秘籍",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuMiJi(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "白芷含芳：1疗伤2会心1效果，约68400修为\n" +
                        "赤芍寒香：2调息1效果1疗伤，约90000修为\n" +
                        "龙葵自苦：2效果1会心1疗伤，约68400修为\n" +
                        "七情和合：2调息2效果，约75600修为\n" +
                        "凌然天风：2调息2效果，约64800修为\n" +
                        "银光照雪：2会心2疗伤，约50400修为\n" +
                        "枯木苏息：2调息2效果，约90000修为\n" +
                        "逐云寒蕊：3效果1减耗，约61200修为\n" +
                        "全部点满共计需要568800修为");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "药奶气劲",matchType = MatchType.TEXT_EQUALS)
    public void getLingSuQiJin(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "建议监控千枝绽蕊（卸除快捷键）、百药宣时（卸除快捷键）、凌然天风、七情、落黄");
        event.getGroup().sendBlocking(message);
    }
}
