package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.user_info;
import com.example.demo.service.UserService;

@CrossOrigin
@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/main")
		public void join(@RequestBody user_info info) {
		System.out.println(info);
		//userService.join(info);
		//return "success";
	}
//	Gson gson = new Gson(); 
//	@RequestMapping(value="/main")
//	public void userInfo(@RequestBody Map<Object, Object> map) {
//		//String jsonStr = gson.toJson(map);
//		System.out.println(map);
//	}
	
}
