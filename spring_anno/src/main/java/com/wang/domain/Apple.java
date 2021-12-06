package com.wang.domain;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Fruit {
    public void show() {
        System.out.println("这是一个苹果");
    }
}
