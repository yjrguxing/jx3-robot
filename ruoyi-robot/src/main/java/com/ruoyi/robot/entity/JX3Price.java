package com.ruoyi.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 剑三金价
 * @author psyduck
 * @Date 2022/5/13 17:57
 * @see
 * @version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JX3Price {
    private String[] price5173;
    private String[] post;
    private String[] official;
}
