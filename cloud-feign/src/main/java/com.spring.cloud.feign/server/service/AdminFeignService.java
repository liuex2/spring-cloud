package com.spring.cloud.feign.server.service;

import com.spring.cloud.feign.server.service.impl.AdminFeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author
 *
 * 通过 @FeignClient("服务名") 注解来指定调用哪个服务
 *
 * 增加 fallback 指定类
 */
@FeignClient(value = "cloud-server",fallback = AdminFeignServiceHystrix.class)
public interface AdminFeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);

}
