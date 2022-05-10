package com.ruoyi.robot.service;

import com.ruoyi.robot.entity.JX3Daily;
import love.forte.simbot.message.Message;

import java.util.List;

/**
 * 剑三日常业务逻辑层
 * @author psyduck
 * @Date 2022/5/8 19:20
 * @see
 * @version 1.0
 **/
public interface JX3DailyService {
    /**
     * 获取日常信息<br/>
     * @param  date 日期
     * @author psyduck
     * @date 2022/5/8 19:21
     * @return String
     */
    String getDaily(String date);

    /**
     * 日常通用处理信息<br/>
     * @param date 日期
     * @author psyduck
     * @date 2022/5/8 19:23
     * @return love.forte.simbot.message.Message
     */
    Message dailyCommon(String date);
}
