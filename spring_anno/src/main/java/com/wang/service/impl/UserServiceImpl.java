package com.wang.service.impl;

import com.wang.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    public void show() {
        System.out.println("show 已经运行。。。。。");
    }
}
