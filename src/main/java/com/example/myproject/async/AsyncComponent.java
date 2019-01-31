package com.example.myproject.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class AsyncComponent {

    @Async
    public Future<String> m1() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("i=" + i);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new AsyncResult<>("方法m1完成");
    }

    @Async
    public Future<String> m2() {
        for (int j = 100; j <= 200; j++) {
            System.out.println("j=" + j);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new AsyncResult<>("方法m2完成");
    }




}
