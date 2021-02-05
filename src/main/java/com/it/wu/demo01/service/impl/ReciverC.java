package com.it.wu.demo01.service.impl;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.C")
//接收者
public class ReciverC {
    @RabbitHandler
    public void process(String content) {
        System.out.println("C: " + content);
    }
}

