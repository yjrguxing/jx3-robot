package com.jx3robot.robot.controller;

import com.jx3robot.robot.entity.JX3Item;
import com.jx3robot.robot.service.JX3ItemService;
import com.jx3robot.robot.util.Const;
import io.swagger.annotations.Api;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.FilterValue;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.Identifies;
import love.forte.simbot.component.mirai.MiraiBot;
import love.forte.simbot.definition.Objectives;
import love.forte.simbot.event.MessageEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 群信息控制器
 * @author psyduck
 * @Date 2022/4/17 0:08 
 * @see
 * @version 1.0
 **/
@Api("剑3物品")
@RestController
@RequestMapping("/jx3/item")
public class JX3ItemController {

    @Autowired
    private JX3ItemService service;

    @Listener
    @Filter(value = "测试")
    public void commonTest(MessageEvent event){
        final Objectives source = event.getSource();
        source.sendIfSupportBlocking(Text.of("Hello"));
    }

    @Listener
    @Filter(value = "到期查询(\\s){{goodName,.*}}",matchType = MatchType.REGEX_MATCHES)
    public void getGoodExpTime(MessageEvent event, @FilterValue("goodName") String goodName){
        // 事件来源
        final Objectives source = event.getSource();
        // 具体物品
        JX3Item jx3Item = service.getGoodExpTime(goodName);
        // 根据到期时间获取相应信息
        Message message = service.goodExpTimeCommon(jx3Item.getName());
        source.sendIfSupportBlocking(message);
    }

    /**
     * 物品到期提醒定时任务<br/>
     * @param
     * @author psyduck
     * @date 2022/4/23 21:07
     * @return void
     */
    @Scheduled(cron = "0 0 7 * * ? ")
    public void taskGoodExpRemind(){

        List<JX3Item> allGoodExpTime = service.getAllGoodExpTime();
        MiraiBot miraiBot = Const.MiraiBotManage.INSTANCE.getMiraiBotManage().get(Identifies.ID(Const.MiraiBot.PSYDUCK.getAccountNumber()));
        for(JX3Item jx3Item: allGoodExpTime){
            Message message = service.goodExpTimeCommon(jx3Item.getName());
            if(message != null){
                miraiBot.getFriend(Identifies.ID("1241280257")).sendBlocking(message);
                miraiBot.getGroup(Identifies.ID("731300905")).sendBlocking(message);
                miraiBot.getGroup(Identifies.ID("451981492")).sendBlocking(message);
            }
        }
    }
}
