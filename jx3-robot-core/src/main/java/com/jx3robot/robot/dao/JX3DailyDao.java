package com.jx3robot.robot.dao;

import com.dtflys.forest.annotation.Get;
import org.springframework.stereotype.Component;

@Component
public interface JX3DailyDao {
    /**
     * 获取剑三日常<br/>
     * @param nowDate 
     * @author psyduck
     * @date 2022/5/10 13:32
     * @return java.lang.String
     */
    @Get("https://cms.jx3box.com/api/cms/game/daily?date={0}")
    String getDaily(String nowDate);
}
