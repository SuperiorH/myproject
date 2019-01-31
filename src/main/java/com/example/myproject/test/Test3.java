package com.example.myproject.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Test3 {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);//创建固定线程
        Executors.newCachedThreadPool();//创建缓存线程
        Executors.newSingleThreadExecutor();//创建单个线程
        ScheduledExecutorService es1 =Executors.newScheduledThreadPool(5);//up all night
    }

}
