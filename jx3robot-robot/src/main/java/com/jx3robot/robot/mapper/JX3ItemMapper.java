package com.jx3robot.robot.mapper;

import com.jx3robot.robot.entity.JX3Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 群信息Mapper层
 * @author psyduck
 * @Date 2022/4/17 16:18
 * @see
 * @version 1.0
 **/
@Mapper
public interface JX3ItemMapper {

    /**
     * 查询物品到期时间<br/>
     * @param name 物品名称
     * @author psyduck
     * @date 2022/4/17 16:22
     * @return java.lang.String
     */
    JX3Item getGoodExpTime(String name);

    /**
     * 查询所有物品到期时间<br/>
     * @author psyduck
     * @date 2022/4/23 21:22
     * @return java.util.List<java.lang.String>
     */
    List<JX3Item> getAllGoodExpTime();
}
