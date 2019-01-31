package com.example.myproject.test;

/**
 * 设计四个线程，其中两个线程每次对data增加1，另外两个线程每次对data减少1。
 */
public class Test2 {

    private int a;

    public synchronized void add() {
        System.out.println("线程名:" + Thread.currentThread().getName() + ",增加前的值:" + a);
        a++;
        System.out.println("线程名:" + Thread.currentThread().getName() + ",增加后的值:" + a);
    }

    public synchronized void reduce() {
        System.out.println("线程名:" + Thread.currentThread().getName() + ",减少前的值:" + a);
        a--;
        System.out.println("线程名:" + Thread.currentThread().getName() + ",减少后的值:" + a);
    }

    public static void main(String[] args) {
        Test2 entity = new Test2();
        for (int i = 0; i < 2; i++) {
            new Thread(() ->
                    entity.add(), "Thread-" + i).start();
        }

        for (int i = 2; i < 4; i++) {
            new Thread(() ->
                    entity.reduce(), "Thread-" + i).start();
        }


    }

}
