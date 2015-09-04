package com.restaurant.controller;

import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;
import com.restaurant.model.User;
import com.restaurant.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	/**
	 * 用户登录
	 * @param session
	 * @param userName
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/login",method = RequestMethod.POST)
	@ResponseBody
	public String userLogin(HttpSession session,String userName,String password){
		User user = new User();
		String result = null;
		JSONObject jsonObject = new JSONObject();
		if (userName!=null) {
			user = userService.findUserByUserName(userName);
			if (user==null) {
				return "1";
			}else if (user.getPwd()==password) {
				jsonObject.put("id", user.getId());
				jsonObject.put("userName", user.getUserName());
				jsonObject.put("pwd", user.getPwd());
				jsonObject.put("phone", user.getPhone());
				jsonObject.put("age", user.getAge());
				jsonObject.put("email", user.getEmail());
				jsonObject.put("createTime", user.getCreateTime());
				result = jsonObject.toString();
				return result;
			}else if (user.getPwd()!=password){
				return "2";
			}
		}
		return result;
	}
	
	@RequestMapping(value="register", method = RequestMethod.POST)
	public String register(HttpSession session,User user){
		int result = 0;
		JSONObject jsonObject = new JSONObject();
		if (user==null) {
			return "1";
		}
		result = userService.addUser(user);
		if (result!=0) {
			//登录成功，返回用户信息
			return userLogin(session, user.getUserName(), user.getPwd());
		}
		return null;
	}
}
