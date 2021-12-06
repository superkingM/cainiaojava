package com.wang.controller;

import com.wang.domain.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FruitController {
    @Autowired
    @Qualifier("banana")
    private Fruit fruit;

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public void show() {
        fruit.show();
    }
}
