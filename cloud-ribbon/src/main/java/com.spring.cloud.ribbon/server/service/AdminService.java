package com.spring.cloud.ribbon.server.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author
 * 通过服务名 CLOUD-SERVER 调用服务
 *
 * 在 Service 中增加 @HystrixCommand 注解
 */
@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 在 Ribbon 调用方法上增加 @HystrixCommand 注解并指定 fallbackMethod 熔断方法
     * @param message
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message){
        return restTemplate.getForObject("http://CLOUD-SERVER/hi?message=" + message,String.class);
    }

    public String hiError(String message){
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

}
