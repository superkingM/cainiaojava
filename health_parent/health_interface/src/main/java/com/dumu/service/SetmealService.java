package com.dumu.service;

import com.dumu.entity.PageResult;
import com.dumu.pojo.Setmeal;

import java.util.List;

/**
 * 体检套餐接口服务
 */
public interface SetmealService {
    public void add(Setmeal setmeal, Integer[] checkgroupIds);
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    Setmeal findById(Integer id);

    List<Integer> findCheckGroupIdsBySetmealId(Integer id);

    void edit(Setmeal setmeal, Integer[] checkGroupIds);
}
