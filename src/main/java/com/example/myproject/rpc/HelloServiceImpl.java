package com.example.myproject.rpc;

public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String arg) {
        return "hello".equals(arg) ? "hello" : "bye bye";
    }

}
