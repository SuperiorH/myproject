package com.example.myproject.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.myproject.configuration")
public class MuConfiguration {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MuConfiguration.class);
        A a = ac.getBean("a", A.class);
        B b = ac.getBean("b", B.class);
        C c = ac.getBean("c", C.class);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
