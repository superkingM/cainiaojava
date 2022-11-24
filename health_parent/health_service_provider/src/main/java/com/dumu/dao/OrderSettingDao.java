package com.dumu.dao;

import com.dumu.pojo.OrderSetting;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface OrderSettingDao {
    long findCountByOrderDate(Date orderDate);
    

    void add(OrderSetting orderSetting);

    List<OrderSetting> getOrderSettingByMonth(Map map);

    void editNumberByOrderDate(OrderSetting orderSetting);
}
