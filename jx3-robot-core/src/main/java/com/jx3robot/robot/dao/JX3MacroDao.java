package com.jx3robot.robot.dao;

import com.dtflys.forest.annotation.Get;
import org.springframework.stereotype.Component;

/**
 * 剑三宏数据访问层
 * @author psyduck
 * @Date 2022/5/17 13:39
 * @see
 * @version 1.0
 **/
@Component
public interface JX3MacroDao {
    /**
     * 获取宏内容接口<br/>
     * @param macroId 宏Id
     * @author psyduck
     * @date 2022/5/17 13:44
     * @return java.lang.String
     */
    @Get("https://cms.jx3box.com/api/cms/post/{0}")
    String getMacro(String macroId);
    /**
     * 获取宏奇穴文件<br/>
     * @param version 奇穴文件版本
     * @author psyduck
     * @date 2022/5/18 9:34
     * @return java.lang.String
     */
    @Get("https://oss.jx3box.com/data/qixue/{0}.json")
    String getMacroTalent(String version);
    /**
     * 获取宏菜单<br/>
     * @author psyduck
     * @date 2022/5/17 14:06
     * @return java.lang.String
     */
    @Get("https://helper.jx3box.com/api/menu_group/macro-rec")
    String getMacroRec();
}
