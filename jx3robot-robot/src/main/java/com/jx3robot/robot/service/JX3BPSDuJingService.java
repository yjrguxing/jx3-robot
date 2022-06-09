package com.jx3robot.robot.service;

/**
 * 剑三毒经业务逻辑层——接口定义
 * @author psyduck
 * @Date 2022/6/8 20:39
 * @see
 * @version 1.0
 **/
public interface JX3BPSDuJingService {

    /**
     * 获取毒经特定宏<br/>
     * @param childMacroName 子宏名称
     * @author psyduck
     * @date 2022/6/8 20:40
     * @return java.lang.String
     */
    public String getDuJingMacro(String childMacroName);
}
