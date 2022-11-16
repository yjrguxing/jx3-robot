package com.jx3robot.robot.service;

import com.jx3robot.robot.entity.JX3Item;
import love.forte.simbot.message.Message;

import java.util.List;

/**
 * 群信息业务逻辑层<br/>
 * @author psyduck
 * @date 2022/4/17 17:32
 * @return
 */
public interface JX3ItemService {

    /**
     * 获取物品到期时间<br/>
     * @param goodName 物品名称
     * @author psyduck
     * @date 2022/4/23 19:16
     * @return java.lang.String
     */
    JX3Item getGoodExpTime(String goodName);

    /**
     * 获取所有物品到期时间<br/>
     * @author psyduck
     * @date 2022/4/23 21:45
     * @return java.util.List<java.lang.String>
     */
    List<JX3Item> getAllGoodExpTime();

    /**
     * 物品到期时间通用处理<br/>
	 * @param goodName 物品名称
     * @author psyduck
     * @date 2022/4/23 19:17
     * @return love.forte.simbot.message.Message
     */
    Message goodExpTimeCommon(String goodName);
}
