package com.it.wu.demo01.config.rabbitMQ;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//工作队列模式，均发
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello",true);
    }

}