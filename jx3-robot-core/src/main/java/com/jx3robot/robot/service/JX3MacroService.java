package com.jx3robot.robot.service;

import love.forte.simbot.message.Message;

/**
 * 剑三宏业务逻辑层
 * @author psyduck
 * @Date 2022/5/17 13:58
 * @see
 * @version 1.0
 **/
public interface JX3MacroService {
    /**
     * 获取宏信息<br/>
     * @param macroId 宏Id
     * @author psyduck
     * @date 2022/5/17 13:59
     * @return java.lang.String
     */
    String getMacro(String macroId);

    /**
     * 获取宏菜单<br/>
     * @author psyduck
     * @date 2022/5/17 14:09
     * @return java.lang.String
     */
    String getMacroRec();

    /**
     * 获取宏奇穴菜单<br/>
     * @param  version 奇穴文件版本
     * @author psyduck
     * @date 2022/5/18 9:36
     * @return java.lang.String
     */
    String getMacroTalent(String version);

    /**
     * 宏通用处理<br/>
     * @param macroName 宏名称
     * @author psyduck
     * @date 2022/5/17 14:05
     * @return love.forte.simbot.message.Message
     */
    Message macroCommon(String macroName);
}
