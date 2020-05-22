package com.consumerdemo.controller;

//import com.consumerdemo.client.ConsumerClient;
import com.consumerdemo.client.ConsumerClient;
import com.consumerdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
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



    @Autowired
    ConsumerClient consumerClient;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("consumer/demo2")
    public  String ConsumerDemo2(){

        /*int a=0;
         */
        Student student=new Student();
        student.setId(1);
        student.setName("hp");
        student.setAddress("cqA");
        return consumerClient.testGetFromProviderdemo(student);
      /* return restTemplate.getForObject("http://localhost:7901/provider/demo",String.class);*/

    }
}