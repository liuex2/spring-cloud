package com.spring.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author
 * Ribbon 是一个负载均衡客户端，可以很好的控制 http 和 tcp 的一些行为。
 *
 * @EnableHystrix 熔断器注解
 *
 * @EnableHystrixDashboard 熔断器仪表盘监控注解
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class RibbonApplication {
    public static void main(String[] args){
        SpringApplication.run(RibbonApplication.class,args);
    }
}
