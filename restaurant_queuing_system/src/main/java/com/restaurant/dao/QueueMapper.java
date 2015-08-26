package com.restaurant.dao;

import com.restaurant.model.Queue;

public interface QueueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Queue record);

    int insertSelective(Queue record);

    Queue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Queue record);

    int updateByPrimaryKey(Queue record);
}