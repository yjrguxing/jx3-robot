package com.ruoyi.robot.dao;

import com.dtflys.forest.annotation.Get;
import org.springframework.stereotype.Component;

/**
 * 莫问数据访问层
 * @author psyduck
 * @Date 2022/5/24 19:02
 * @see
 * @version 1.0
 **/
@Component
public interface JX3BPSMoWenDao {

    @Get("https://cms.jx3box.com/api/cms/post/34702")
    public String getMoWenCalculatorContent();
}
