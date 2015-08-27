package com.restaurant.service;

import java.util.List;

import com.restaurant.model.Order;

public interface OrderService {
	//添加订单
	public int addOrder(Order order);
	//删除订单
	public  int deleteOrder(int id);
	//更改订单
	public int updateOrder(Order order);
	//查找订单
	public Order findOrderById(int id);
	//通过用户id来查找订单列表
	public List<Order> findOrderByUserId(int userId);
}
