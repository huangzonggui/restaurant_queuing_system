package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;
import com.restaurant.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login")
	@ResponseBody
	public String userLogin(){
		JsonObject object = new JsonObject();
		object.addProperty("name", "jat");
		object.addProperty("pwd", "123456");
		String result = object.toString();
		System.out.println("success");
		return result;
	}
}
