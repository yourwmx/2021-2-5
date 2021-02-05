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
//发送者
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping("/send")
    public void send(UserEntity userEntity) {
//            String context = "hello " + new Date();
            System.out.println("Sender : " + userEntity.toString());
            this.rabbitTemplate.convertAndSend("hello", userEntity);
    }

    @RequestMapping("/send1")
    public void send1() {
        String context = "hi, i am message 1";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.message", context);
    }

    @RequestMapping("/send2")
    public void send2() {
        String context = "hi, i am messages 2";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
    }

    @RequestMapping("/send3")
    public void send3() {
        String context = "hi, fanout msg ";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("fanoutExchange","", context);
    }

}