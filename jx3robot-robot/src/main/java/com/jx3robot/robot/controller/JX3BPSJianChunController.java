package com.jx3robot.robot.controller;

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
 * 剑三剑纯职业问答
 * @author psyduck
 * @Date 2022/6/3 0:52
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSJianChunController {
    @Listener
    @Filter(value = "剑纯",matchType = MatchType.TEXT_EQUALS)
    public void getJianChun(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "剑纯白皮书\n" +
                        "剑纯奇穴\n" +
                        "剑纯特效武器\n" +
                        "剑纯计算器\n" +
                        "剑纯常用监控\n" +
                        "剑纯配装思路\n" +
                        "剑纯懒羊羊配装\n" +
                        "剑纯镜花影小灰灰一图流\n" +
                        "剑纯宏\n" +
                        "剑纯小药\n" +
                        "剑纯羊村图书馆交流群");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "剑纯白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunWhitePaper(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "镜花影白皮书【单体推荐，较难】：https://www.jx3box.com/bps/41565\n" +
                        "云中剑白皮书【群攻推荐】：https://www.jx3box.com/bps/34434\n" +
                        "无意循环概述：https://www.jx3box.com/bps/40866\n");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "剑纯奇穴",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunQiXue(MiraiGroupMessageEvent event){
        Text text1 = Text.of(
                "镜花影流派【单体推荐，较难】\n");
        Image image1 = event.getBot().uploadImageBlocking(Resource.of(new File("./jx3robot-robot/src/main/resources/Image/JianChun/剑纯奇穴1.png")));
        Text text2 = Text.of(
                "云中剑流派：【群攻推荐】\n");
        Image image2 = event.getBot().uploadImageBlocking(Resource.of(new File("./jx3robot-robot/src/main/resources/Image/JianChun/剑纯奇穴2.png")));
        Text text3 = Text.of(
                "无意流派：\n");
        Image image3 = event.getBot().uploadImageBlocking(Resource.of(new File("./jx3robot-robot/src/main/resources/Image/JianChun/剑纯奇穴3.png")));
        Text text4 = Text.of(
                "分歧选择：\n" +
                        "群攻且不缺蓝时：第三层【化三清】换【白虹】\n" +
                        "战斗时间短：第八层可选【负阴】，有玉简时可考虑【若水】\n" +
                        "牺牲自己DPS洗小队碎增益:第九层【故长】改【和光】");
        Message message = Messages.toMessages(text1, image1, text2, image2, text3, image3, text4);
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "剑纯特效武器",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunTeXiao(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "110级画影上手攻略：https://www.jx3box.com/bps/34022");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "剑纯计算器",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunCalculator(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "云中剑计算器：https://www.jx3box.com/tool/39985\n" +
                        "暂无镜花影计算器，如需要相关配装可参考云中剑计算器，以云中剑属性为基准.\n在会心与外功攻击这两个板块与对应竞争属性的属性收益非常接近时可以考虑替换成会心和攻击，相对来说需要低一点点破招，以上结论都是相对而非绝对，具体可以参考云中剑计算器的属性收益板块。");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "剑纯常用监控",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunJianKong(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "https://www.jx3box.com/jx3dat/41715\n" +
                        "本监控包含特效武器-画影、橙武-玄鹤唳天、镜花影流派相关监控，如不需要可在茗伊界面导入后移除相关部分。");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "剑纯配装思路",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunPeiZhuangSiLu(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "当前江湖无限赛季配装核心思路为建立在【牌子2件套】激活剑鸣特效的基础上（一般使用头脚）自由搭配\n常用切糕衣服与切糕腰带/护腕加一个护腕/腰带精简及精简裤子\n一般必备特效腰坠（与剑纯紫气爆发对齐收益较高）\n具体可参考剑纯云中剑计算器（准确但麻烦）或查询懒羊羊配装（便捷但不总是准）。");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "剑纯懒羊羊配装",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunSimplePeiZhuang(MiraiGroupMessageEvent event){
        Image image1 = event.getBot().uploadImageBlocking(Resource.of(new File("./jx3robot-robot/src/main/resources/Image/JianChun/剑纯配装1.png")));
        Image image2 = event.getBot().uploadImageBlocking(Resource.of(new File("./jx3robot-robot/src/main/resources/Image/JianChun/剑纯配装2.png")));
        Messages messages = Messages.toMessages(image1, image2);
        event.getGroup().sendBlocking(messages);
    }
    @Listener
    @Filter(value = "剑纯镜花影小灰灰一图流",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunJHYSimplePeiZhuang(MiraiGroupMessageEvent event){
        Image image1 = event.getBot().uploadImageBlocking(Resource.of(new File("./jx3robot-robot/src/main/resources/Image/JianChun/剑纯配装3.png")));
        event.getGroup().sendBlocking(image1);
    }
    @Listener
    @Filter(value = "剑纯宏",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunMacro(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "剑纯当前版本不论哪种循环都是围绕气场展开，因气场相关同时有放置位置与伤害延迟等影响，故剑纯目前不推荐使用一键宏\n如一定要使用可输入关键词“宏 剑纯”或去BOX自行查阅使用。");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "剑纯小药",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunXiaoYao(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "辅助类食品：奉天·杂锦鱼球粥【身法】\n" +
                        "辅助类药品：奉天·上品轻身丹【身法】\n" +
                        "增强类食品：奉天·红烧排骨【破防】/奉天·白肉血肠【破招】\n" +
                        "增强类药品：奉天·上品破秽散【破防】/奉天·上品凝神散【破招】\n" +
                        "依据自身现有属性合理选择。");
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "剑纯羊村图书馆交流群",matchType = MatchType.TEXT_EQUALS)
    public void getJianChunShare(MiraiGroupMessageEvent event){
        Message message = Text.of(
                "图书馆地下1楼【1群】：721040621\n" +
                        "图书馆2楼【2群】：372248473\n" +
                        "图书馆3楼【3群】：752470393");
        event.getGroup().sendBlocking(message);
    }
}
