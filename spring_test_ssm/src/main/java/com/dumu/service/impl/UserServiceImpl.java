package com.dumu.service.impl;

import com.dumu.domain.User;
import com.dumu.domain.UserRole;
import com.dumu.mapper.UserMapper;
import com.dumu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public void save(User user, Long[] roleIds) {
        userMapper.save(user);
        Long userId = user.getId();
        for (Long roleId : roleIds) {
            UserRole userRole = new UserRole();
            userRole.setUserId(userId);
            userRole.setRoleId(roleId);
            userMapper.saveUserRoleRel(userRole);
        }

    }

    @Override
    public void del(Long userId) {
        userMapper.delUserRoleRel(userId);
        userMapper.delUser(userId);
    }

    @Override
    public User login(String username, String password) {
        User user = userMapper.login(username, password);
        return user;
    }
}
