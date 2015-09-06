package com.restaurant.service.impl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.UserMapper;
import com.restaurant.model.User;
import com.restaurant.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		int result = 0;
		if (user!=null) {
			Date date = new Date(System.currentTimeMillis());
			user.setCreateTime(date);
			result = userMapper.insert(user);
		}
		return result;
	}

	/**
	 * 用户资料更新功能
	 */
	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		int result = 0;
		if (user!=null) {
			result = userMapper.updateByPrimaryKey(user);
		}
		return result;
	}

	@Override
	public User findUser(int id) {
		// TODO Auto-generated method stub
		User user = new User();
		if (id>0) {
			user = userMapper.selectByPrimaryKey(id);
		}
		return user;
	}

	@Override
	public int deletUser(int id) {
		// TODO Auto-generated method stub
		int result = 0;
		if (id>0) {
			result = userMapper.deleteByPrimaryKey(id);
		}
		return result;
	}

	@Override
	public User findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		User user = new User();
		if (userName==null) {
			return null;
		}
		user = userMapper.selectByUserName(userName);
		return user;
	}
	
	
}
