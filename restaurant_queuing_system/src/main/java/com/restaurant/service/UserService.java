package com.restaurant.service;

import org.springframework.stereotype.Repository;

import com.restaurant.model.User;
public interface UserService {

	//添加用户
	public int addUser(User user);
	//更新用户
	public int updateUser(User user);
	//通过id查找用户
	public User findUser(int id);
	//通过id查找用户
	public User findUserByUserName(String userName);
	//根据id删除用户
	public int deletUser(int id);

}
