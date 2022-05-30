package com.jx3robot.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 剑三日常实体类
 * @author psyduck
 * @Date 2022/5/8 19:17
 * @see
 * @version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JX3Daily {
    private Integer id;
    private String task_type;
    private String activity_name;
    private String created_at;
}
