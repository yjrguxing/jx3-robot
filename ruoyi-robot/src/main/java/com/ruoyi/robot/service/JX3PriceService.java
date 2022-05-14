package com.ruoyi.robot.service;

import love.forte.simbot.message.Message;

/**
 * JX3金价查询
 * @author psyduck
 * @Date 2022/5/13 15:56
 * @see
 * @version 1.0
 **/
public interface JX3PriceService {
    /**
     * 获取金价<br/>
     * @author psyduck
     * @date 2022/5/13 16:08
     * @return java.lang.String
     */
    String getPrice();

    /**
     * 日常通用处理信息<br/>
     * @param serviceName 区服名称
     * @author psyduck
     * @date 2022/5/8 19:23
     * @return love.forte.simbot.message.Message
     */
    Message priceCommon(String serviceName);
}
