package com.dumu.mapper;

import com.dumu.domain.User;
import com.dumu.domain.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> list();

    void save(User user);

    void saveUserRoleRel(UserRole userRole);

    void delUser(Long userId);

    void delUserRoleRel(Long userId);
    User login(@Param("username") String username,@Param("password") String password);
}
