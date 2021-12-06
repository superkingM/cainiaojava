package com.wang.dao.impl;

import com.wang.dao.UserDao;

public class UserDaoImpl1 implements UserDao {
    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save() {
        System.out.println(username + "--" + age);
    }
}
