package com.jx3robot.robot.controller;

import com.jx3robot.robot.service.JX3BPSMoWenService;
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
 * 剑三莫问职业问答控制层
 * @author psyduck
 * @Date 2022/5/24 17:10
 * @see
 * @version 1.0
 **/
@RestController
public class JX3BPSMoWenController {
    private Long lastRequestTime = System.currentTimeMillis();
    private Long ms = Long.valueOf(10 * 1000);
    private StringBuilder diffms = new StringBuilder("0");

    private final JX3BPSMoWenService service;
    public JX3BPSMoWenController (JX3BPSMoWenService service){
        this.service = service;
    }
    @Listener
    @Filter(value = "莫问",matchType = MatchType.TEXT_EQUALS)
    public void getMoWen(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of(
                    "莫问一分钟入门\n" +
                            "莫问白皮书\n" +
                            "莫问计算器\n" +
                            "莫问实战攻略\n" +
                            "莫问试炼\n" +
                            "莫问浪客行\n" +
                            "风雷攻略\n" +
                            "莫问精简\n" +
                            "莫问加速\n" +
                            "莫问配装\n" +
                            "宏 莫问\n" +
                            "莫问大群 871642468");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "莫问白皮书",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenWhitePaper(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问白皮书:https://www.jx3box.com/bps/38529\n" +
                    "分为基础篇[入门/技能/奇穴/循环/速成配装]&进阶篇[键盘连点&插件设置/计算器的应用&属性详解/进阶配装/风雷&橙武/一些小细节&小技巧]，小鸽子们可以根据个人需求选择不同的章节进行阅读。");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问攻略集",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenStrategy(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问攻略集:https://www.jx3box.com/bbs/#/collection/142");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "风雷攻略",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenTempest(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("风雷怎么做 https://www.jx3box.com/bps/37022\n" +
                    "风雷怎么用 https://www.jx3box.com/bps/37193");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问试炼",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenTrial(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问试炼:https://www.jx3box.com/bps/40737");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问浪客行",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenVagabond(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问浪客行:https://www.jx3box.com/bps/40738");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问计算器",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenCalculator(MiraiGroupMessageEvent event){
        String calculatorVersion = service.getMoWenCalculatorContent();
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问计算器:https://www.jx3box.com/tool/34702");
            if(calculatorVersion != null){
                message = Text.of("莫问计算器:https://www.jx3box.com/tool/34702\n" +
                        "最新版本：V" + calculatorVersion + "\n" +
                        "请从jx3box计算器更新页面或莫问大群下载最新版本到电脑上使用。\n" +
                        "计算器更新页面有说明书，不会用的话可以去看看。");
            }
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问实战攻略",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenActualCombat(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问实战攻略\nhttps://www.jx3box.com/bps/40014\n" +
                    "https://www.jx3box.com/bps/40561");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问加速",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenSpeed(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问加速\n大橙武6296/4540\n" +
                    "小橙武4540/2956\n" +
                    "其他武器2956\n" +
                    "4540是影子的阈值 相比4026有较大提升\n" +
                    "非大橙武不推荐6296是因为大橙武特效可以回复徵充能 而其他武器不能 导致后期打羽\n" +
                    "4540和2956相比容易掉dot 如果续不上建议2956");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问配装",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenPeiZhuangMenu(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问小橙武\n" +
                    "莫问橙武\n" +
                    "莫问副本武器\n" +
                    "莫问速成\n" +
                    "莫问平民\n" +
                    "莫问精简");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    /**
     *莫问小橙武配装
     */
    @SneakyThrows
    @Listener
    @Filter(value = "莫问小橙武",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenXiaoChengWu(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            Image image1 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装1.png")));
            Image image2 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装2.png")));
            message = Messages.toMessages(image1, image2);
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    /**
     *莫问橙武配装
     */
    @SneakyThrows
    @Listener
    @Filter(value = "莫问橙武",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenChengWu(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装3.png")));
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    /**
     * 莫问基本配装
     */
    @SneakyThrows
    @Listener
    @Filter(value = "莫问副本武器",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenJiBen(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            Image image1 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装4.png")));
            Image image2 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装5.png")));
            message = Messages.toMessages(image1, image2);
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    /**
     *莫问速成配装
     */
    @SneakyThrows
    @Listener
    @Filter(value = "莫问速成",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenSuCheng(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            Image image1 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装6.png")));
            Image image2 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装7.png")));
            message = Messages.toMessages(image1, image2);
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    /**
     *莫问平民配装
     */
    @SneakyThrows
    @Listener
    @Filter(value = "莫问平民",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenPingmin(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            Image image1 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装1.png")));
            Image image2 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装5.png")));
            message = Messages.toMessages(image1, image2);
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    /**
     *莫问精简配装
     */
    @SneakyThrows
    @Listener
    @Filter(value = "莫问精简",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenJingJian(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            Image image1 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装4.png")));
            Image image2 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装3.png")));
            Image image3 = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问配装2.png")));
            message = Messages.toMessages(image1, image2, image3);
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @SneakyThrows
    @Listener
    @Filter(value = "莫问精简",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenJingJianChoose(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = event.getBot().uploadImageBlocking(Resource.of(new File("jx3robot-robot/src/main/resources/Image/MoWen/莫问精简.png")));
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问一分钟入门",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenintroduction(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问一分钟入门\n起手：孤影开 羽影 商影 角影 孤影关\n" +
                    "宏：\n" +
                    "/cast [tbufftime:商<6] 高山流水\n" +
                    "/fcast 阳春白雪\n" +
                    "/cast [tnobuff:商] 商\n" +
                    "/cast [tnobuff:角] 角\n" +
                    "/cast 变宫\n" +
                    "/cast [buff:书离] 徵\n" +
                    "/cast 羽\n" +
                    "/cast 疏影横斜\n" +
                    "奇穴：伏疏 飞帆 逐华 流照 豪情 师襄 知止 刻梦 书离 云汉 参连 无尽藏\n" +
                    "装备：大附魔用玉简 加速2956 小橙武溢出过多可选4540（影子阈值）破招3000左右或者更低 破防无双基本平衡 会心30左右\n" +
                    "游戏设置-特殊门派设置-勾选自动释放阳春白雪\n" +
                    "剑心插件集-技能增强-影子释放模式选择鼠标射线\n" +
                    "自己开阵＞和尚阵＞队友莫问阵＞田螺阵＞气纯阵");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    /**
     * 需要节流返回true<br/>
     * @author psyduck
     * @date 2022/5/25 10:07
     * @return boolean true为需要节流 false则不需要
     */
    public boolean throttle(){
        long diffms = System.currentTimeMillis() - lastRequestTime;
        long second = 10 - (diffms % 1000 == 0 ? diffms / 1000 : diffms / 1000 + 1);
        if(diffms < ms){
            this.diffms.setCharAt(0,String.valueOf(second).charAt(0));
            return true;
        }
        lastRequestTime = System.currentTimeMillis();
        return false;
    }
}
