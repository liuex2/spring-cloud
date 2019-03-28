package com.spring.cloud.config.client.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author
 *
 * 创建一个 Controller 来测试一下通过远程仓库的配置文件注入 foo 属性
 */
@RestController
public class TestConfigController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return foo;
    }
}
