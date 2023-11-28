package com.example.demo.src.user.config;

import com.example.demo.src.user.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataInitializationService {

    private final RedisCacheService redisCacheService;

    @Autowired
    public DataInitializationService(RedisCacheService redisCacheService) {
        this.redisCacheService = redisCacheService;
    }

    public void initializeData() {
        redisCacheService.setWithExpiration("key1", "value1", 30L);
        redisCacheService.setWithExpiration("key2", "value2", 40L);
        redisCacheService.setWithExpiration("key3", "value3", 50L);
    }
}
