package com.dumu.dao;

import com.dumu.pojo.Setmeal;
import com.github.pagehelper.Page;

import java.util.Map;

public interface SetmealDao {
    public void add(Setmeal setmeal);

    public void setSetmealAndCheckGroup(Map<String, Integer> map);
    public Page<Setmeal> selectByCondition(String queryString);

}
