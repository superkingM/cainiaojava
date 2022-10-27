package com.dumu.service;

import com.dumu.domain.Role;

import java.util.List;

public interface RoleService {
    List<Role> list();

    void save(Role role);
}
