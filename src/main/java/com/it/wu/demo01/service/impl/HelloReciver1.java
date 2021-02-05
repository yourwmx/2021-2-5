package com.it.wu.demo01.service.impl;

import com.it.wu.demo01.model.UserEntity;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
//接收者1
public class HelloReciver1 {
    @RabbitHandler
    public void process(UserEntity userEntity) {
        System.out.println("Receiver1  : " + userEntity);
    }
}
