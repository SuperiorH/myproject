package com.example.myproject.rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Filter;

@RestController
@RequestMapping("/rabbit")
public class RabbitController {

    @Autowired
    private HelloSender1 sender1;
    @Autowired
    private HelloSender2 sender2;
    @Autowired
    private TopicSender topicSender;

    @RequestMapping("/send")
    public void send() {
        for (int i = 0; i < 10; i++) {
            sender1.send("message" + i);
            sender2.send("message" + i);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @GetMapping("/topicTest")
    public void topicTest() {
        topicSender.send();
    }

    public static void main(String[] args) {
        Class c1 = Filter.class;
        System.out.println(c1.isInterface());
    }

}
