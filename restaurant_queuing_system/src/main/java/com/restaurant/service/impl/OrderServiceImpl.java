package com.restaurant.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.OrderMapper;
import com.restaurant.model.Order;
import com.restaurant.service.OrderService;
import com.sun.crypto.provider.RSACipher;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		int result = 0;
		if (order!=null) {
			order.setCreateTime(new Date(System.currentTimeMillis()));
			result = orderMapper.insert(order);
		}
		return result;
	}

	@Override
	public int deleteOrder(int id) {
		// TODO Auto-generated method stub
		int result = 0;
		if (id>0) {
			result = orderMapper.deleteByPrimaryKey(id);
		}
		return result;
	}

	@Override
	public int updateOrder(Order order) {
		// TODO Auto-generated method stub
		int result = 0;
		if (order!=null) {
			result = orderMapper.updateByPrimaryKey(order);
		}
		return result;
	}

	@Override
	public String findOrderById(int id) {
		// TODO Auto-generated method stub
		Order order = new Order();
		if (id>0) {
			order = orderMapper.selectByPrimaryKey(id);
		}
		return order.toString();
	}

	@Override
	public String findOrderByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
