package com.example.myproject.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static User init() {
        User u = new User();
        Class class1 = u.getClass();
        Method[] methods = class1.getDeclaredMethods();
        Arrays.stream(methods).filter((m) -> m.isAnnotationPresent(Init.class)).forEach((m) -> {
            Init init = m.getAnnotation(Init.class);
            try {
                m.setAccessible(true);
                if (m.getName().equals("setAge")) {
                    m.invoke(u, Integer.parseInt(init.value()));
                } else {
                    m.invoke(u, init.value());
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });
        return u;
    }

    public static void main(String[] args) {
        User u = init();
        System.out.println(u);
    }
}
