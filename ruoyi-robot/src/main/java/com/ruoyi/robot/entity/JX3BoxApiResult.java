package com.ruoyi.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 魔盒接口返回数据实体类
 * @author psyduck
 * @Date 2022/5/13 15:52
 * @see
 * @version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JX3BoxApiResult<T> {
    private String msg;
    private String code;
    private T data;
}
