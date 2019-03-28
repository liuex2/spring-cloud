package com.spring.cloud.feign.server.controller;

import com.spring.cloud.feign.server.service.AdminFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminFeignController {

    @Autowired
    private AdminFeignService adminFeignService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message){
        return adminFeignService.sayHi(message);
    }
}
