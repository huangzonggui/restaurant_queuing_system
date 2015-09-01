package com.restaurant.service;

import com.restaurant.model.User;

public interface UserService {
	
	//添加用户
	public int addUser(User user);
	//更新用户
	public int updateUser(User user);
	//通过id查找用户
	public String findUser(int id);
	//根据id删除用户
	public int deletUser(int id);
	
}
