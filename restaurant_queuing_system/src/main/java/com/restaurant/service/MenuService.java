package com.restaurant.service;

import java.util.List;

import com.restaurant.model.Menu;

public interface MenuService {
	
	//添加菜单 
	public int addMenu(Menu menu);
	//删除菜单
	public int deleteMenu(int id);
	//更改菜单
	public int updateMenu(Menu menu);
	//查找菜单
	public  Menu findMenuById(int id);
	//查找菜单列表
	public List<Menu> findMenuList();
}
