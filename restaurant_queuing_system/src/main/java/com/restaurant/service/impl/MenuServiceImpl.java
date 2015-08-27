package com.restaurant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.restaurant.dao.MenuMapper;
import com.restaurant.service.OrderService;

public class MenuServiceImpl implements OrderService {
	
	@Autowired
	private MenuMapper menuMapper;

}
