package com.dumu.service.impl;

import com.dumu.dao.RoleDao;
import com.dumu.dao.UserDao;
import com.dumu.domain.Role;
import com.dumu.domain.User;
import com.dumu.service.UserService;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> list() {
        List<User> userList = userDao.findAll();
        //封装userList 的 roles 数据
        for (User user : userList) {
            Long id = user.getId();
            List<Role> roles = roleDao.findRoleByUserId(id);
            user.setRoles(roles);
        }
        return userList;
    }

    public void save(User user, Long[] roleIds) {
        //user存
        Long userId = userDao.save(user);
        //关系表存
        userDao.saveUserRoleRel(userId, roleIds);
    }

    public void del(Long userId) {
        userDao.delUserRoleRel(userId);
        userDao.del(userId);
    }

    public User login(String username, String password) {
        try {
            User user = userDao.findByUsernameAndPassword(username, password);
            return user;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }
}
