package com.ruoyi.robot.controller;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.web.bind.annotation.RestController;

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
                        "铁牢河阳之战\n" +
                        "铁牢白皮书\n" +
                        "铁牢计算器\n" +
                        "铁牢配装\n" +
                        "铁牢阵眼\n" +
                        "铁牢小药\n" +
                        "铁牢实战视频");
        event.getGroup().sendBlocking(message);
    }
}
