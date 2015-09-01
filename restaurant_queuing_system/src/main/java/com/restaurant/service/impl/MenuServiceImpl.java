package com.restaurant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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
	public String findMenuById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findMenuList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String resultToJson(List<Menu> list){
		JsonArray array = new JsonArray();
		JsonObject jsonObject = new JsonObject();
		Menu menu = new Menu();
		int length = list.size();
		for (int i = 0; i < length; i++) {
			jsonObject.addProperty("id", menu.getId());
			jsonObject.addProperty("storeId", menu.getStoreId());
			jsonObject.addProperty("menuName", menu.getMenuName());
			jsonObject.addProperty("picture", menu.getPicture());
			jsonObject.addProperty("category", menu.getCategory());
			jsonObject.addProperty("price", menu.getPrice());
			jsonObject.addProperty("createTime", menu.getCreateTime().toString());
			array.add(jsonObject);
		}
		return array.toString();
	}

}
