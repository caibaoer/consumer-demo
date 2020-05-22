package com.consumerdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @desc：
 * @title：Config
 * @author: huangwencai
 * @date: 2020-01-08 8:18
 * @version: v4.40.0
 */
@Configuration
public class Config {
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
        /*RestTemplate 设置超时
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setReadTimeout(3000);
        requestFactory.setConnectTimeout(3000);
        return  new RestTemplate(requestFactory);
        */

    }
}