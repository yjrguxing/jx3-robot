package com.jx3robot.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JX3Item {
    // 物品编码
    private String code;
    // 物品名称
    private String name;
    // 物品到期时间
    private String expTime;
}
