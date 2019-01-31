package com.example.myproject.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfiguration {

    @Bean
    @Profile("dev")
    public DemoBean bean1(){
        return new DemoBean("开发环境的bean");
    }

    @Bean
    @Profile("prod")
    public DemoBean bean2(){
        return new DemoBean("生产环境的bean");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
//      ac.getEnvironment().setActiveProfiles("prod");
//        ac.getEnvironment().setDefaultProfiles("dev");
//        ac.register(ProfileConfiguration.class);
//        ac.refresh();
//        DemoBean bean = ac.getBean(DemoBean.class);
//        System.out.println(bean.getContent());
        boolean str = ac.getEnvironment().getProperty("os.name").contains("Windows");
        System.out.println(str);
        ac.close();
    }
}
