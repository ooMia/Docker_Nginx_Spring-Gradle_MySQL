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
        // 여기에서 원하는 초기 데이터를 Redis에 삽입
        // redisCacheService.setWithExpiration("key1", "value1");
    }
}
