package com.example.myproject.test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Test4 {
    private String name;
    private Double price;
    private List<String> students;

    public static void main(String[] args) {
        Class clazz = Test4.class;
        Field[] array = clazz.getDeclaredFields();
        Arrays.stream(array).forEach((e) -> System.out.println(e.getName()));


//        Random ran = new Random();
//        List<Future<Integer>> list = new ArrayList<>();
//        for (int i = 1; i < 10; i++) {
//            FutureTask<Integer> ft = new FutureTask<>(() -> {
//                int value = ran.nextInt(10);
//                System.out.println("生成的值为:" + value);
//                return value;
//            });
//            Thread thread = new Thread(ft);
//            thread.start();
//            list.add(ft);
//        }
//        AtomicInteger sum = new AtomicInteger();
//        list.forEach((e) -> {
//            try {
//                sum.addAndGet(e.get());
//            } catch (InterruptedException e1) {
//                e1.printStackTrace();
//            } catch (ExecutionException e1) {
//                e1.printStackTrace();
//            }
//        });
//        System.out.println(sum.get());

//        ExecutorService es = Executors.newFixedThreadPool(10);
//        List<Future<Integer>> list = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            Future<Integer> future = es.submit(() -> {
//                int value = ran.nextInt(10);
//                System.out.println("生成的随机数:" + value);
//                return value;
//            });
//            list.add(future);
//        }
//        Thread.sleep(3000L);
//        list.forEach((e) ->
//        {
//            try {
//                System.out.println(e.get());
//            } catch (InterruptedException e1) {
//                e1.printStackTrace();
//            } catch (ExecutionException e1) {
//                e1.printStackTrace();
//            }
//        });
//        es.shutdown();
    }

    public void test() {
        System.out.println(12345);
    }


}
