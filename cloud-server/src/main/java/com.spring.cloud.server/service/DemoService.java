package com.spring.cloud.server.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public interface DemoService {

    /**
     *
     * @return
     */
    @Cacheable(cacheNames = "name",key = "")
    public int cache();


}
