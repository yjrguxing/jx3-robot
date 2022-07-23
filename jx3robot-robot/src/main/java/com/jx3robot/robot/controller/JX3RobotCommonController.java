package com.jx3robot.robot.controller;

import com.jx3robot.robot.util.FileUtil;
import lombok.SneakyThrows;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.component.mirai.message.MiraiSendOnlyImage;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import love.forte.simbot.resources.Resource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JX3RobotCommonController {

    @Listener
    @SneakyThrows
    @Filter(value = "功能",matchType = MatchType.TEXT_EQUALS)
    public void getCommonMessage(MiraiGroupMessageEvent event){
        Message message = event.getBot().uploadImageBlocking(Resource.of(FileUtil.getFileInputStream("/Image/common/menu.png")));
        event.getGroup().sendBlocking(message);
    }
}
