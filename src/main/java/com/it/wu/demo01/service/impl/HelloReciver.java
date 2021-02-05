package com.it.wu.demo01.service.impl;

import com.it.wu.demo01.model.UserEntity;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
//接收者
public class HelloReciver {

    @RabbitHandler
    public void process(UserEntity userEntity) {
        System.out.println("Receiver  : " + userEntity);
    }

}
