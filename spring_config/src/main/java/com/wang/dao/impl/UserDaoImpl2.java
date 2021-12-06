package com.wang.dao.impl;

import com.wang.dao.UserDao;
import com.wang.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl2 implements UserDao {
    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
    }
}
