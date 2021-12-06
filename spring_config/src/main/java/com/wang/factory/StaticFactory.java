package com.wang.factory;

import com.wang.dao.UserDao;
import com.wang.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
