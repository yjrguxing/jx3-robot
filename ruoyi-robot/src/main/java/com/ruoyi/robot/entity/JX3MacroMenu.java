package com.ruoyi.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 魔盒宏菜单项实体类
 * @author psyduck
 * @Date 2022/5/17 14:12
 * @see
 * @version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JX3MacroMenu {
    private String icon;
    private String link;
    private String color;
    private String label;
}
