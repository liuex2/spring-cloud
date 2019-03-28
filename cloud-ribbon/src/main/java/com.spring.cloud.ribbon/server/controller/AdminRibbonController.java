package com.spring.cloud.ribbon.server.controller;

import com.spring.cloud.ribbon.server.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminRibbonController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String getMessage(@RequestParam(value = "message") String message) {
        return adminService.sayHi(message);
    }
}
