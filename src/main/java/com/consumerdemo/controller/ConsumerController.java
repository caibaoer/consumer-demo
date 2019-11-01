package com.consumerdemo.controller;

import com.consumerdemo.client.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @desc：
 * @title：ConsumerController
 * @author: huangwencai
 * @date: 2019-10-23 10:02
 * @version: v4.40.0
 */

@RestController
public class ConsumerController {
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ConsumerClient consumerClient;

    @RequestMapping("consumer/demo1")
    public  String ConsumerDemo1(){
        return this.restTemplate.getForObject("http://localhost:7900/provider/demo",String.class);
    }

    @RequestMapping("consumer/demo2")
    public  String ConsumerDemo2(){
        int a=0;
        return consumerClient.testGetFromProviderdemo();
    }
}