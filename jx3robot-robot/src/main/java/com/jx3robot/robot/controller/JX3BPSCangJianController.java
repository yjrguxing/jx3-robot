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
                    "藏剑PVE打法\n" +
                    "藏剑循环视频");
        event.getGroup().sendBlocking(message);
    }

    @Listener
    @Filter(value = "藏剑宏",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianMacro(MiraiGroupMessageEvent event){
        Text of = Text.of("轻剑宏：\n" +
                "/cast [nearby_enemy>0&skill:18682] 九溪弥烟\n" +
                "/cast 玉虹贯日\n" +
                "/cast [nearby_enemy>0&bufftime:玉简·藏剑<1.5] 黄龙吐翠\n" +
                "注：玉九黄续玉简请在九溪GCD转1秒后手动黄龙后啸日，黄九玉续玉简请在黄龙九溪后拉开5尺等玉虹后啸日。\n" +
                "\n" +
                "夜雨重剑宏：\n" +
                "/cast [bufftime:雾锁>1.3&nobuff:凤鸣&nobuff:麟战] 听雷\n" +
                "/cast [bufftime:雾锁>1.3&buff:麟战|buff:夜雨] 云飞玉皇\n" +
                "/cast 夕照雷峰\n" +
                "奇穴：[淘尽][清风][夜雨][景行][映波锁澜][怜光][层云][撼岳][雾锁][残雪][如风][听晓]\n" +
                "\n" +
                "岱宗重剑宏：\n" +
                "/cast [bufftime:岱宗<3|bufftime:雾锁>1.3&buff:凤鸣|buff:麟战] 云飞玉皇\n" +
                "/cast [rage<15|bufftime:雾锁>1.3&nobuff:凤鸣|bufftime:雾锁>4] 听雷\n" +
                "/cast 夕照雷峰\n" +
                "奇穴：[淘尽][清风][岱宗][景行][映波锁澜][怜光][层云][撼岳][雾锁][残雪][如风][听晓]");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "藏剑加速",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianSpeed(MiraiGroupMessageEvent event){
        Text of = Text.of("点如风奇穴：514   不点如风奇穴：43\n" +
                "大小CW加速900以上，夕照读条1.19，手感更好");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "藏剑秘籍",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianBook(MiraiGroupMessageEvent event){
        Text of = Text.of("九溪弥烟：2本范围+任意\n" +
                "黄龙吐翠：2本剑气+任意 （驱散秘籍点出备用）\n" +
                "云飞玉皇：①夜雨：3伤害1会心   ②岱宗：2伤害2读条\n" +
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
        Image image1 = event.getBot().uploadImageBlocking(Resource.of(Image1FileInputStream));
        Image image2 = event.getBot().uploadImageBlocking(Resource.of(Image2FileInputStream));
        Text of = Text.of("各部位毕业装备选择：\n" +
                "武器：5690大CW>5300小CW>7100水特效>7100会无>4980小CW\n" +
                "护手：空川手（会会破）>切糕手（招破）≈湖风手（纯会）≈暗水手（招破会）\n" +
                "裤子：蕊休裤（会破无）>切糕裤（会无）≈天长裤（会无）\n" +
                "戒指：继圣戒（会会招）>万世戒（会破）≈春锦戒（会无）\n" +
                "帽子：6550无皇头（会会）>隐章冠（会无）≈承霁头（招破）\n" +
                "腰带：琴光腰（破无）≈承霁腰（会无）\n" +
                "暗器：6920无皇囊（会会）>斩锋囊（会无）\n" +
                "腰坠：6920无皇腰坠（会会无）>归说（特效破无）≈概世坠（声望会无）\n" +
                "除了以上列出的装备外其他精简不考虑加入配装。\n");
        Messages messages = Messages.toMessages(image1, image2, of);
        event.getGroup().sendBlocking(messages);
    }

    @Listener
    @Filter(value = "藏剑计算器",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianCalculator(MiraiGroupMessageEvent event){
        Text of = Text.of("作者青墨白宣：https://www.jx3box.com/tool/31129\n" +
                "作者留情@梦江南：https://www.jx3box.com/tool/40179");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "藏剑常见问题",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianQA(MiraiGroupMessageEvent event){
        Text of = Text.of("https://www.jx3box.com/bps/41445");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "藏剑PVE打法",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianPVE(MiraiGroupMessageEvent event){
        Text of = Text.of("https://www.jx3box.com/bps/38610");
        event.getGroup().sendBlocking(of);
    }

    @Listener
    @Filter(value = "藏剑循环视频",matchType = MatchType.TEXT_EQUALS)
    public void getCangjianVideo(MiraiGroupMessageEvent event){
        Text of = Text.of("橙武：https://www.bilibili.com/video/BV1uY4y1L7ks\n" +
                "非橙武：https://www.bilibili.com/video/BV1ZL4y1P7wX");
        event.getGroup().sendBlocking(of);
    }


}
