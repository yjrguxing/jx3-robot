package com.jx3robot.robot.controller;

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

import java.io.File;

/**
 * 剑三衍天宗职业问答控制层
 * @author psyduck
 * @Date 2022/5/24 23:20
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSYanTianController {
    @Listener
    @Filter(value = "衍天",matchType = MatchType.TEXT_EQUALS)
    public void getYanTian(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "衍天白皮书\n" +
                        "衍天计算器\n" +
                        "衍天入门视频\n" +
                        "衍天焚如一键宏\n" +
                        "衍天3分钟技能数\n" +
                        "衍天2分钟技能数\n" +
                        "衍天阵眼排序\n" +
                        "衍天小药推荐\n" +
                        "衍天试炼\n" +
                        "衍天实战视频");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "衍天白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianWhitePaper(MiraiGroupMessageEvent event){
        Message message = Text.of("衍天白皮书:https://www.jx3box.com/bps/39504\n" +
                "有问题先去看白皮书 奇穴 秘籍 大附魔 游戏设置 配装 属性收益 五彩石 循环 一键二段三段六段宏用法与视频 新手入门视频等 你想问的里面都有！");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "衍天入门视频",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianRuMenVideo(MiraiGroupMessageEvent event){
        Message message = Text.of("衍天入门视频\n衍天PVE系统及插件、宏设置 https://www.bilibili.com/video/BV1HY4y1k7NQ  作者：萧玉衡\n" +
                "衍天PVE灵增【山水循环】&【火山循环】讲解 https://www.bilibili.com/video/BV1Pg411j7g6  作者：猫灯灯\n" +
                "衍天pve新手向老循环剖析 https://www.bilibili.com/video/BV1a34y1h7GX 作者：云沐沐");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "衍天计算器",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianJiSuanQi(MiraiGroupMessageEvent event){
        Message message = Text.of("衍天计算器:https://www.jx3box.com/tool/34313");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "衍天焚如一键宏",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianFenRu(MiraiGroupMessageEvent event){
        Message message = Text.of("焚如一键宏 作者：萧枯木\n" +
                "/cast 纵横三才·一\n" +
                "/cast 祝由·火离\n" +
                "/cast 兵主逆\n" +
                "/cast 起卦\n" +
                "/cast 变卦\n" +
                "/cast [nobuff:鬼遁] 鬼星开穴\n" +
                "/cast 奇门飞宫\n" +
                "/cast 返闭惊魂\n" +
                "/cast 天斗旋\n" +
                "/cast 三星临\n" +
                "奇穴：[水盈][天网][顺祝][荧入白][重山][鬼遁][亘天[神元][枭神][征凶][焚如][增卜]\n" +
                "有玉简大附魔的点亘天\n" +
                "没有大附魔的 第八层奇穴 亘天 换成祝祷\n" +
                "操作模式设置 目标位置 按键开启");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "衍天3分钟技能数",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianThree(MiraiGroupMessageEvent event){
        Message message = Text.of("25斗93兵148灵器37临87火160天网+（奇穴 天网 连断 亘天 增卜）有玉简大附魔");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "衍天2分钟技能数",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianTwo(MiraiGroupMessageEvent event){
        Message message = Text.of("17斗60兵59火97灵器110天网24临（奇穴 天网 连断 亘天 增卜）有玉简大附魔");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "衍天阵眼排序",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianZhenYan(MiraiGroupMessageEvent event){
        Message message = Text.of("田螺花间大师莫问气纯毒经");
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "衍天小药推荐",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianXiaoYao(MiraiGroupMessageEvent event){
        Image image = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/YanTian/衍天小药.png")));
        event.getGroup().sendBlocking(image);
    }
    @Listener
    @Filter(value = "衍天试炼",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianShiLian(MiraiGroupMessageEvent event){
        Message message = Text.of("这个赛季衍天无论是在单体还是群攻方面，都得到了一定的加强，由于衍天的独特机制，使得衍天在试炼之地中的表现十分优秀，同时，作为110等级的靠后赛季，属性容量比较饱和，从而导致这个赛季想要冲高层的难度大大降低，无论是做完美成就，还是冲刺120层，这个赛季都是目前最好的一个赛季。\n" +
                "衍天作为上手难度较高的门派，试炼之地同样有一定的门槛，很多关卡需多加练习，下面提供一些自己的思路。\n" +
                "前九关思路视频：https://www.bilibili.com/video/BV1VY4y1L78N/\n" +
                "雷神思路视频：https://www.bilibili.com/video/BV1Qa411f7oR/ \n" +
                "文字版教程：衍天白皮书第七篇 试炼篇 https://www.jx3box.com/bps/39504  试炼篇作者：恩静");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "衍天实战视频",matchType = MatchType.TEXT_EQUALS)
    public void getYanTianVideo(MiraiGroupMessageEvent event){
        Message message = Text.of("衍天宗水特效天网连段大战英雄河阳老一 by风雪入我怀\n" +
                "https://www.bilibili.com/video/BV1Eg411o7KD\n" +
                " 衍天宗河阳之战英雄老三鬼神增卜流思路教学（结尾附卡广角教程）by风雪入我怀\n" +
                "https://www.bilibili.com/video/BV1ht4y1s7oj\n");
        event.getGroup().sendBlocking(message);
    }
}
