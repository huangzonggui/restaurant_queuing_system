package com.restaurant.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.restaurant.model.User;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    /**
     * 通过用户名查询用户信息，用于登录
     * @param user_name
     * @return
     */
    User selectByUserName(@Param("user_name") String user_name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}