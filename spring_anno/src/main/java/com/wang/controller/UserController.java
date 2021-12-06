package com.wang.controller;

import com.wang.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
    @Autowired
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void show() {
        System.out.println("show 已经执行....");
    }

    public void run() {
        user.show();
    }
}
