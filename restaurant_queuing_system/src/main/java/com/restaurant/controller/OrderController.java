package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restaurant.service.OrderService;

@Controller
@RequestMapping(value="/order/")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
}
