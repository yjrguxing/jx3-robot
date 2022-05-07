package com.ruoyi.web.controller.tool;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试swagger")
@RestController
@RequestMapping("test/swagger")
public class TestSwaggerController {
    @ApiOperation("测试swagger方法")
    @GetMapping("test")
    public void test(){
        System.out.println("测试swagger");
    }
}
