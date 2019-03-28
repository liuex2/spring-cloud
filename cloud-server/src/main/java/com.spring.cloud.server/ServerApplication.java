package com.spring.cloud.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author admin
 * 服务提供者
 *
 * 需要增加 server 相关配置，并设置端口号为：8763
 *
 * 使用缓存
 *  * 1开启缓存注解@EnableCaching
 *  * 2标注缓存注解：
 *  * @Cacheable
 *  * @Cachevict
 *  * @Cacheput
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.spring.cloud.server.mapper")
public class ServerApplication {
    public static void main(String[] args){
        SpringApplication.run(ServerApplication.class, args);
    }
}
