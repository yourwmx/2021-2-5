package com.it.wu.demo01.service.impl;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
//接收者
public class Reciver {
    @RabbitHandler
    public void process(String content) {
        System.out.println("1: " + content);
    }
}
