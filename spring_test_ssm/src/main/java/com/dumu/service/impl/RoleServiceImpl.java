package com.dumu.service.impl;

import com.dumu.domain.Role;
import com.dumu.mapper.RoleMapper;
import com.dumu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("RoleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> list() {

        return roleMapper.list();
    }

    @Override
    public void save(Role role) {
        roleMapper.save(role);
    }
}
