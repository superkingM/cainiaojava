package com.wang.dao.impl;

import com.wang.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void show() {
        System.out.println("show 已经运行");
    }
}
