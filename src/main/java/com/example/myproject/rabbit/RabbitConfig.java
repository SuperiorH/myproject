package com.example.myproject.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue1(){
        return new Queue("hello");
    }
    @Bean
    public Queue queue2(){
        return new Queue("topic.messages");
    }
    @Bean
    public Queue queue3(){
        return new Queue("topic.message");
    }
}
