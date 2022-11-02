package com.dumu.mapper;

import com.dumu.domain.Role;

import java.util.List;

public interface RoleMapper {
    List<Role> list();

    void save(Role role);
}
