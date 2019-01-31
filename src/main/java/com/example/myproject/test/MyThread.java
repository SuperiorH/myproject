package com.example.myproject.test;

public class MyThread {

    private static final ThreadLocal<MyThread> THREAD_LOCAL = new ThreadLocal<>();

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void add() {
        value++;
    }

    public void minus() {
        value--;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                ThreadLocal<MyThread> tt = gen();
                MyThread m = tt.get();
                for (int j = 1; j <= 10; j++) {
                    m.add();
                    System.out.println(Thread.currentThread().getName() + ":" + m.getValue());
                }
            }, "Thread" + i).start();
        }
    }

    private static ThreadLocal<MyThread> gen() {
        MyThread myThread = THREAD_LOCAL.get();
        if (myThread == null) {
            THREAD_LOCAL.set(new MyThread());
        }
        return THREAD_LOCAL;
    }
}
