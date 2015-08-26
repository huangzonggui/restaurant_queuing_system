package com.restaurant.dao;

import com.restaurant.model.CommetPicture;

public interface CommetPictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommetPicture record);

    int insertSelective(CommetPicture record);

    CommetPicture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommetPicture record);

    int updateByPrimaryKey(CommetPicture record);
}