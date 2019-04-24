package com.example.myproject.test;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test4 {

    public static void main(String[] args) {
        Set<Integer> set = pick();
        System.out.println(set);
//        Random ran = new Random();
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

    /**
     * 从1~20随机选出15个数字
     */
    private static Set<Integer> pick() {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        while (1 == 1) {
            int value = random.nextInt(21);
            set.add(value);
            if (set.size() >= 15) {
                break;
            }
        }
        return set;
    }

}
