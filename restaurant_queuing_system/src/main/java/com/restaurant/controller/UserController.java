package com.restaurant.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;
import com.restaurant.model.User;
import com.restaurant.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login")
	@ResponseBody
	public String login(HttpServletRequest request,HttpServletResponse response){
		return "1";
	}
	
	/**
	 * 用户登录
	 * @param session
	 * @param userName
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/loginuser",method = RequestMethod.GET)
	@ResponseBody
	public String userLogin(HttpServletRequest request,String userName,String password){
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
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@RequestMapping(value="register", method = RequestMethod.GET)
	public String register(@RequestParam(value="userName",required = false,defaultValue = "")String userName,
			@RequestParam(value="password",required = false,defaultValue = "")String password,
			@RequestParam(value="phone",required = false,defaultValue = "")String phone,
			@RequestParam(value="email",required = false,defaultValue = "")String email,
			@RequestParam(value="sex",required = false,defaultValue = "男")String sex){
		int result = 0;
		JSONObject jsonObject = new JSONObject();
//		if (user==null) {
//			return "1";
//		}
		
		User user = null;
		result = userService.addUser(user);
		if (result!=0) {
			//登录成功，返回用户信息
			//return userLogin(user.getUserName(), user.getPwd());
		}
		return null;
	}
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value="updateUser", method = RequestMethod.POST)
	public String updateUser(User user){
		int result = 0;
		if (user!=null) {
			result = userService.updateUser(user);
			if (result!=0) {
				//return userLogin(user.getUserName(), user.getPwd());
			}
		}
		return null;
	}
}
