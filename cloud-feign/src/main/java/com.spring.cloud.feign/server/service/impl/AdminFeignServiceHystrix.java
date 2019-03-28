package com.spring.cloud.feign.server.service.impl;

import com.spring.cloud.feign.server.service.AdminFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author
 *
 * 创建熔断器类并实现对应的 Feign 接口
 */
@Component
public class AdminFeignServiceHystrix implements AdminFeignService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
