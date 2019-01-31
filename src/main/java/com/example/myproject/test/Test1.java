package com.example.myproject.test;

import java.util.Random;

public class Test1 {

    public static ThreadLocal<Integer> local = new ThreadLocal<>();

    public static void getLocalValue() {
        System.out.println("当前的线程名:" + Thread.currentThread().getName() + ",value值为" + local.get());
    }


    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Thread t1 = new Thread(() -> {
            int value = random.nextInt();
            local.set(value);
            getLocalValue();
        }, "Thread-1");
        Thread t2 = new Thread(() -> {
            int value = random.nextInt();
            local.set(value);
            getLocalValue();
        }, "Thread-2");
        Thread t3 = new Thread(() -> {
            int value = random.nextInt();
            local.set(value);
            getLocalValue();
        }, "Thread-3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }

}
