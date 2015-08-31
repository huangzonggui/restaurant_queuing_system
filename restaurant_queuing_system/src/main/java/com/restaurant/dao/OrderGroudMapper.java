package com.restaurant.dao;

import com.restaurant.model.OrderGroud;

public interface OrderGroudMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderGroud record);

    int insertSelective(OrderGroud record);

    OrderGroud selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderGroud record);

    int updateByPrimaryKey(OrderGroud record);
}