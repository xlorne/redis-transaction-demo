package com.example.redis.controller;

import com.example.redis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by lorne on 2017/11/28
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService redisService;

    @RequestMapping("/save")
    public String save(){
       return redisService.save();
    }

}
