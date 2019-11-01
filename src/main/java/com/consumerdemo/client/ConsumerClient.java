package com.consumerdemo.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @desc：
 * @title：ConsumerClient
 * @author: huangwencai
 * @date: 2019-10-23 10:56
 * @version: v4.40.0
 */
//@Component
@FeignClient(value = "provider-demo")  //@FeignClient在spring-cloud-starter-openfeign jar包里面
public interface ConsumerClient {
    @RequestMapping(value = "/provider/demo",method = RequestMethod.GET)
    String testGetFromProviderdemo();
}