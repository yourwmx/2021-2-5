package com.it.wu.demo01.controller;

import com.it.wu.demo01.model.UserEntity;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Component
@RestController
//发送者1
public class HelloSender1 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(UserEntity userEntity) {
        String context = "hello " + new Date();
        System.out.println("Sender : " + userEntity.toString());
        this.rabbitTemplate.convertAndSend("hello", userEntity);
    }
}
