package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserinfoMapper;
import com.example.demo.model.user_info;

@Service
public class UserinfoService {
	
	@Autowired
	UserinfoMapper userinfoMapper;

	public int sign(user_info userinfo) {
		return userinfoMapper.sign(userinfo);
	}
	
	public user_info login(user_info userinfo) {
		return userinfoMapper.login(userinfo);
	}
}