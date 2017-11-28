package com.example.redis.service.impl;

import com.example.redis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * create by lorne on 2017/11/28
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    @Transactional
    public String save() {
        String name = "hello"+Thread.currentThread().getId();
        ValueOperations operations =  redisTemplate.opsForValue();
        operations.set("name",name);
        int i = 100/0;
        return name;
    }
}
