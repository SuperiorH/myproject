package com.example.myproject.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {

    private Object target;

    public MyProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用方法前");
        Object obj = method.invoke(target, args);
        System.out.println("调用方法后");
        return obj;
    }

    public Object newInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        MyInterface myInterface = new MyImpl();
        MyProxy proxy = new MyProxy(myInterface);
        MyInterface my = (MyInterface) proxy.newInstance();
        System.out.println(my.getClass());
        my.method1();
    }


}
