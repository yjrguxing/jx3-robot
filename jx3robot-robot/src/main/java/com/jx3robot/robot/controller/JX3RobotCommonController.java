package com.jx3robot.robot.controller;

import com.jx3robot.robot.util.FileUtil;
import lombok.SneakyThrows;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.action.ActionType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.component.mirai.message.MiraiSendOnlyImage;
import love.forte.simbot.event.GroupJoinRequestEvent;
import love.forte.simbot.event.MemberIncreaseEvent;
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

    @Listener
    @SneakyThrows
    public void memberJoinGroup(MemberIncreaseEvent event){
        String msg = "当前发生了一次成员新增事件,他的qq号:" + event.getAfter().getId() +
                ",群昵称:" + event.getAfter().getNickname() +
                ",用户名:" + event.getAfter().getUsername() +
                ",入群时间:" + event.getAfter().getJoinTime() + (ActionType.PASSIVE.name().equals(event.getActionType()) ? ",邀请人:" + event.getOperator().getNickname() :",入群方式:主动入群");
        System.out.println(event.getActionType());
        System.out.println(event.getActionType().name());
        System.out.println(ActionType.PASSIVE.name());
        event.getSource().sendIfSupportBlocking(Text.of(msg));
    }
}
