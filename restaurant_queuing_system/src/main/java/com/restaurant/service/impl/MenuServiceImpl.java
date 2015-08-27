package com.restaurant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.restaurant.dao.MenuMapper;
import com.restaurant.model.Menu;
import com.restaurant.service.MenuService;
import com.restaurant.service.OrderService;

public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuMapper menuMapper;

	@Override
	public int addMenu(Menu menu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMenu(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMenu(Menu menu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Menu findMenuById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> findMenuList() {
		// TODO Auto-generated method stub
		return null;
	}

}
