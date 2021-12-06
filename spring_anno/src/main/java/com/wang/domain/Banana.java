package com.wang.domain;

import org.springframework.stereotype.Component;

@Component
public class Banana implements Fruit {
    public void show() {
        System.out.println("这是一个香蕉");
    }
}
