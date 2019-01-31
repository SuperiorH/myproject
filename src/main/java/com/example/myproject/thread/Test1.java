package com.example.myproject.thread;

public class Test1 {

    public static void main(String[] args) {
        Inner inner = new Inner();
        Thread t1 = new Thread(() -> inner.output("zhangsan"));
        Thread t2 = new Thread(() -> inner.output("Lisi"));
        t1.start();
        t2.start();
    }
}


class Inner {
    public synchronized void output(String name) {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + i);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}