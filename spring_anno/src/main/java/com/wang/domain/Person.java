package com.wang.domain;

public class Person {
    private String name;
    private String addr;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + "=" + addr + "=" + age);
    }
}
