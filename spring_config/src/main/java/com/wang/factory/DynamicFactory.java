package com.wang.factory;

import com.wang.dao.UserDao;
import com.wang.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
