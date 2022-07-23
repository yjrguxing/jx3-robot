package com.jx3robot.robot.controller;

import com.jx3robot.robot.util.FileUtil;
import lombok.SneakyThrows;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Image;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import love.forte.simbot.resources.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 气纯职业问答
 * @author psyduck
 * @Date 2022/6/23 22:07
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSQiChunController {

    @Listener
    @Filter(value = "气纯",matchType = MatchType.TEXT_EQUALS)
    @Filter(value = "紫霞功",matchType = MatchType.TEXT_EQUALS)
    public void getQiChun(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "气纯白皮书\n" +
                        "气纯DPS进阶\n" +
                        "气纯大附魔\n" +
                        "气纯奇穴\n" +
                        "气纯配装\n" +
                        "气纯属性\n" +
                        "气纯精简选择\n" +
                        "气纯宏\n" +
                        "气纯阵眼\n" +
                        "气纯群");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "气纯白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunBook(MiraiGroupMessageEvent event){
        Text of = Text.of("https://www.jx3box.com/bps/7694\n" +
                "有问题先去看白皮书，奇穴、秘籍、大附魔、游戏监控设置、配装、属性收益、五彩石、循环、宏用法等。你想问的想看到的99%都有。");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "气纯DPS进阶",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunJinJie(MiraiGroupMessageEvent event){
        Text of = Text.of("https://www.jx3box.com/bps/36751");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "气纯大附魔",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunDaFuMo(MiraiGroupMessageEvent event){
        Text of = Text.of("https://www.jx3box.com/bps/33187");
        event.getGroup().sendBlocking(of);
    }

    @SneakyThrows
    @Listener
    @Filter(value = "气纯奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunQiXue(MiraiGroupMessageEvent event){
        Image image = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/QiChun/气纯奇穴.png")));
        event.getGroup().sendBlocking(image);
    }

    @Listener
    @Filter(value = "气纯配装",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunPeiZhuang(MiraiGroupMessageEvent event){
        Text of = Text.of("优先四件套，不要破招，破无均衡，会心随缘。\n" +
                "气纯套装收益稳定，且攻击频率高触发几率大收益可观，因此首选四件套。作为根骨加成的心法，装备散件尽可能选择破防。副本无体精简优先选择攻会会破/攻破无/攻会破无。若条件允许，可以考虑配上攻纯破/攻会会的无皇。");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "气纯属性",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunAttr(MiraiGroupMessageEvent event){
        Text of = Text.of("会效>基础~破防~无双>会心>根骨>破招");
        event.getGroup().sendBlocking(of);
    }

    @SneakyThrows
    @Listener
    @Filter(value = "气纯精简选择",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunJingJian(MiraiGroupMessageEvent event){
        Image image = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/QiChun/气纯精简.png")));
        event.getGroup().sendBlocking(image);
    }

    @Listener
    @Filter(value = "气纯宏",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunMacro(MiraiGroupMessageEvent event){
        Text of = Text.of("气纯一键宏：\n" +
                "/cast [nobuff:气剑|bufftime:气剑<1.5] 万世不竭\n" +
                "/cast [nobuff:破苍穹] 破苍穹\n" +
                "/cast 镇山河\n" +
                "/cast 六合独尊\n" +
                "/cast [qidian>7] 两仪化形\n" +
                "/cast 四象轮回\n" +
                "/cast 紫气东来\n" +
                "注意：要使用此宏，请按ESC在 界面设置 - 战斗相关 中技能释放位置选择改成目标位置，勾选破苍穹对自己施展；并关闭剑心技能释放位置设置；如果开按键，按键间隔不能太短，否则会导致卡宏无法释放气场类技能（如六合独尊、破苍穹）；且气点存在判定延迟，无法使用宏进行精准判定；同小队不能有纯阳，否则无法落气场。\n" +
                "如果你只是为了打个大战或者临时替人上号，那么在设置完上述奇穴和一键宏后你就已经可以打出及格的输出了。\n" +
                "\n" +
                "气纯辅助宏：\n" +
                "常规输出宏：\n" +
                "/cast [nobuff:气剑|bufftime:气剑<1.5] 万世不竭\n" +
                "/cast [qidian>7] 两仪化形\n" +
                "/cast 四象轮回\n" +
                "/cast 九转归一\n" +
                "/cast 三才化生\n" +
                "部分boss请在宏“/cast 九转归一”后面加个1，使改行语句失效，以免推到不该推的小怪。辅助宏只是辅助大家输出，请手动补破苍穹、打六合，打万世；\n" +
                "“/cast [nobuff:气剑|bufftime:气剑<1.5] 万世不竭”这是一个保险语句，在你忘记手动爆万世的时候会帮你补爆万世，常规循环中，请手动打万世不竭。\n" +
                "\n" +
                "爆发宏：\n" +
                "【六合独尊】接\n" +
                "/cast 紫气东来\n" +
                "/cast [buff:(13753)(1)纯阳_心固] 两仪化形\n" +
                "/cast [last_skill=万世不竭] 凭虚御风\n" +
                "/cast 四象轮回\n" +
                "在破苍穹气场剩余大于12秒时，读完六合独尊，按此宏直至紫气结束，再按常规宏即可完成爆发下操作。\n");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "气纯阵眼",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunZhenYan(MiraiGroupMessageEvent event){
        Text of = Text.of("田螺>气纯>大师>莫问>花间（谁打得高听谁的吃谁的，有田螺吃田螺，没田螺也不用争，自己去T奶队开阵一样）");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "气纯群",matchType = MatchType.TEXT_EQUALS)
    public void getQiChunGroup(MiraiGroupMessageEvent event){
        Text of = Text.of("1群774079502、2群994120357、3群910747251不要重复加群");
        event.getGroup().sendBlocking(of);
    }
}
