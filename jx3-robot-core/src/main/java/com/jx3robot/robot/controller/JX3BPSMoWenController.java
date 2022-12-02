package com.jx3robot.robot.controller;

import com.jx3robot.robot.service.JX3BPSMoWenService;
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
                    "莫问PVE总览\n" +
                            "PVE莫问进阶\n" +
                            "莫问宏\n" +
                            "莫问配装\n" +
                            "莫问大群 871642468");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问PVE总览",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenXiaoYao(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问PVE总览 https://www.jx3box.com/bps/45973");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "PVE莫问进阶",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenWhitePaper(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("PVE莫问进阶随笔  https://www.jx3box.com/bps/45413");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
    @Listener
    @Filter(value = "莫问宏",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenStrategy(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("枫小楼-莫问流照宏 https://www.jx3box.com/macro/15681");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "莫问配装",matchType = MatchType.TEXT_EQUALS)
    public void getMoWenTempest(MiraiGroupMessageEvent event){
        Message message = null;
        if (!throttle()) {
            message = Text.of("莫问属性分配与配装 https://www.jx3box.com/bps/49122\n" +
                    "配装仅供参考，请以个人掉落与情况搭配");
        } else {
            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
        }
        event.getGroup().sendBlocking(message);
    }
//    @Listener
//    @Filter(value = "莫问试炼",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenTrial(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            message = Text.of("莫问试炼:https://www.jx3box.com/bps/40737");
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    @Listener
//    @Filter(value = "莫问浪客行",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenVagabond(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            message = Text.of("莫问浪客行:https://www.jx3box.com/bps/40738");
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    @Listener
//    @Filter(value = "莫问计算器",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenCalculator(MiraiGroupMessageEvent event){
//        String calculatorVersion = service.getMoWenCalculatorContent();
//        Message message = null;
//        if (!throttle()) {
//            message = Text.of("莫问计算器:https://www.jx3box.com/tool/34702");
//            if(calculatorVersion != null){
//                message = Text.of("莫问计算器:https://www.jx3box.com/tool/34702\n" +
//                        "最新版本：V" + calculatorVersion + "\n" +
//                        "请从jx3box计算器更新页面或莫问大群下载最新版本到电脑上使用。\n" +
//                        "计算器更新页面有说明书，不会用的话可以去看看。");
//            }
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    @Listener
//    @Filter(value = "莫问实战攻略",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenActualCombat(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            message = Text.of("莫问实战攻略\nhttps://www.jx3box.com/bps/40014\n" +
//                    "https://www.jx3box.com/bps/40561");
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    @Listener
//    @Filter(value = "莫问加速",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenSpeed(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            message = Text.of("莫问加速\n" +
//                    "大橙武6296 如果没出加速暗器可以暂时4540\n" +
//                    "小橙武4540/2956\n" +
//                    "其他武器2956\n" +
//                    "4540是影子的阈值 相比4026有较大提升 游戏内枫影插件集没显示\n" +
//                    "非大橙武不推荐6296是因为大橙武特效可以回复徵充能 而其他武器不能 导致后期多打羽\n" +
//                    "4540和2956相比容易掉dot 计算器4540档不考虑续dot问题 如果实战频繁掉dot 请走2956\n" +
//                    "想要深入研究的可以查阅白皮书相关章节\n");
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    @Listener
//    @Filter(value = "莫问配装",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenPeiZhuangMenu(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            message = Text.of("莫问配装\n" +
//                    "————————\n" +
//                    "莫问速成配装\n" +
//                    "莫问平民配装\n" +
//                    "莫问精简配装\n" +
//                    "————————\n" +
//                    "莫问副本武器配装\n" +
//                    "莫问小橙武配装\n" +
//                    "莫问大橙武配装");
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    /**
//     *莫问小橙武配装
//     */
//    @SneakyThrows
//    @Listener
//    @Filter(value = "莫问小橙武配装",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenXiaoChengWu(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            InputStream Image1FileInputStream = FileUtil.getFileInputStream("/Image/MoWen/莫问配装1.png");
//            InputStream Image2FileInputStream = FileUtil.getFileInputStream("/Image/MoWen/莫问配装2.png");
//
//            Image image1 = event.getBot().uploadImageBlocking(Resource.of(Image1FileInputStream));
//            Image image2 = event.getBot().uploadImageBlocking(Resource.of(Image2FileInputStream));
//            message = Messages.toMessages(image1, image2);
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    /**
//     *莫问橙武配装
//     */
//    @SneakyThrows
//    @Listener
//    @Filter(value = "莫问大橙武配装",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenChengWu(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            message = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装3.png")));
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    /**
//     * 莫问基本配装
//     */
//    @SneakyThrows
//    @Listener
//    @Filter(value = "莫问副本武器配装",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenJiBen(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            Image image1 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装4.png")));
//            Image image2 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装5.png")));
//            message = Messages.toMessages(image1, image2);
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    /**
//     *莫问速成配装
//     */
//    @SneakyThrows
//    @Listener
//    @Filter(value = "莫问速成配装",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenSuCheng(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            Image image1 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装6.png")));
//            Image image2 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装7.png")));
//            message = Messages.toMessages(image1, image2);
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    /**
//     *莫问平民配装
//     */
//    @SneakyThrows
//    @Listener
//    @Filter(value = "莫问平民配装",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenPingmin(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            Image image1 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装1.png")));
//            Image image2 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装5.png")));
//            message = Messages.toMessages(image1, image2);
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    /**
//     *莫问精简配装
//     */
//    @SneakyThrows
//    @Listener
//    @Filter(value = "莫问精简配装",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenJingJian(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            Image image1 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装4.png")));
//            Image image2 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装3.png")));
//            Image image3 = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问配装2.png")));
//            message = Messages.toMessages(image1, image2, image3);
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    @SneakyThrows
//    @Listener
//    @Filter(value = "懒咕精简",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenJingJianChoose(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//
//            message = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问精简.png")));
////            message = Text.of("内容在修改中哦！请稍候！");
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
//    @SneakyThrows
//    @Listener
//    @Filter(value = "莫问一分钟入门",matchType = MatchType.TEXT_EQUALS)
//    public void getMoWenintroduction(MiraiGroupMessageEvent event){
//        Message message = null;
//        if (!throttle()) {
//            Image image = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/MoWen/莫问一分钟入门.png")));
//            Text text = Text.of("无脑一键宏：\n" +
//                    "/cast [tbufftime:商<5] 高山流水\n" +
//                    "/fcast 阳春白雪\n" +
//                    "/cast [tnobuff:商] 商\n" +
//                    "/cast [tnobuff:角] 角\n" +
//                    "/cast 变宫\n" +
//                    "/cast [buff:书离] 徵\n" +
//                    "/cast 羽\n" +
//                    "/cast 疏影横斜");
//            message = Messages.toMessages(image, text);
//        } else {
//            message = Text.of("请等待" + diffms + "秒再尝试！谢谢！");
//        }
//        event.getGroup().sendBlocking(message);
//    }
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
