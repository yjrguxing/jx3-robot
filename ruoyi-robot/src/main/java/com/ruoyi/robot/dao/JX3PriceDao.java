package com.ruoyi.robot.dao;

import com.dtflys.forest.annotation.Get;
import org.springframework.stereotype.Component;

/**
 * JX3金价查询数据接口
 * @author psyduck
 * @Date 2022/5/13 15:48
 * @see
 * @version 1.0
 **/
@Component
public interface JX3PriceDao {
    /**
     * 获取剑三金价<br/>
     * @author psyduck
     * @date 2022/5/13 15:51
     * @return java.lang.String
     */
    @Get("https://spider.jx3box.com/jx3price")
    String getPrice();
}
