package com.dumu.service;

import com.dumu.entity.PageResult;
import com.dumu.pojo.CheckGroup;

import java.util.List;

/**
 * 检查组服务接口
 */
public interface CheckGroupService {
    void add(CheckGroup checkGroup, Integer[] checkItemIds);

    public PageResult pageQuery(Integer currentPage, Integer pageSize, String
            queryString);

    CheckGroup findById(Integer id);

    List<Integer> findCheckItemIdsByCheckGroupId(Integer id);

    public void edit(CheckGroup checkGroup, Integer[] checkitemIds);
    List<CheckGroup> findAll();
}
