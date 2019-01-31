package com.example.myproject.annotation;

public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Init(value = "hehe")
    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Init(value = "123")
    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
