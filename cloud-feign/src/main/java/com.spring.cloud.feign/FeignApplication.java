package com.spring.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author
 * @EnableFeignClients 注解开启 Feign 功能
 *
 * Feign 采用的是基于接口的注解
 *
 * Feign 默认集成了 Ribbon，并和 Eureka 结合，默认实现了负载均衡的效果
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
