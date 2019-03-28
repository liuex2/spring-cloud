package com.spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableEurekaClient
public class ServerApplication2 {
    public static void main(String[] args){
        SpringApplication.run(ServerApplication2.class, args);
    }
}

