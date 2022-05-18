package com.ruoyi.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 剑三宏信息
 * @author psyduck
 * @Date 2022/5/17 14:29
 * @see
 * @version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JX3Macro {
    /**
     * 宏id
     */
    private String icon;
    /**
     * 宏名称
     */
    private String name;
    private String desc;
    private String equip;
    private String macro;
    private String speed;
    private JX3MacroTalent talent;
    private String equip_type;
}
