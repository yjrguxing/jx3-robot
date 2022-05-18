package com.ruoyi.robot.controller;

import com.ruoyi.robot.service.JX3MacroService;
import com.ruoyi.robot.util.Const;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.FilterValue;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.component.mirai.event.MiraiGroupMessageEvent;
import love.forte.simbot.message.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/jx3/macro")
public class JX3MacroController {

    private final JX3MacroService service;

    public JX3MacroController(JX3MacroService service){
        this.service = service;
    }

    @Listener
    @Filter(value = "宏(\\s){{macroName,.*}}",matchType = MatchType.REGEX_MATCHES)
    public void getJX3Macro(MiraiGroupMessageEvent event, @FilterValue("macroName") String macroName){
        HashMap<String, String> bpsHashMap = Const.CommonHashMap.bpsHashMap;
        if(!bpsHashMap.containsKey(macroName)){
            return;
        }
        Message message = service.macroCommon(macroName);
        // 调试用信息
        //System.out.println(message.toString());
        event.getGroup().sendBlocking(message);
    }
}
