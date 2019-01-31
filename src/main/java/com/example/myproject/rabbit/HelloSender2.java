package com.example.myproject.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender2 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String message) {
        String context = message + new Date();
        System.out.println("Sender2 : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}
