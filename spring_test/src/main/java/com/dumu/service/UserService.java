package com.dumu.service;

import com.dumu.domain.User;

import java.util.List;

public interface UserService {

    List<User> list();

    void save(User user, Long[] roleIds);

    void del(Long userId);

    User login(String username, String password);
}
