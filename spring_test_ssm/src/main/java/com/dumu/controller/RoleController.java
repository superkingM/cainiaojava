package com.dumu.controller;

import com.dumu.domain.Role;
import com.dumu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/save")
    public String save(Role role) {
        roleService.save(role);
        return "redirect:/role/list";
    }

    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<Role> roleList = roleService.list();
        System.out.println(roleList);
        modelAndView.addObject("roleList", roleList);
        modelAndView.setViewName("role-list");
        return modelAndView;
    }
}
