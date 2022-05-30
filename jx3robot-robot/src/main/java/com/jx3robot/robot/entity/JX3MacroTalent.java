package com.jx3robot.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 剑三宏奇穴
 * @author psyduck
 * @Date 2022/5/17 16:53
 * @see
 * @version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JX3MacroTalent {
    // 奇穴版本
    private String version;
    // 心法
    private String xf;
    // 奇穴编码
    private String sq;
}
