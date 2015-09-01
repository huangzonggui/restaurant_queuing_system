package com.restaurant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.OrderMapper;
import com.restaurant.model.Order;
import com.restaurant.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOrder(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOrder(Order order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String findOrderById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findOrderByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
