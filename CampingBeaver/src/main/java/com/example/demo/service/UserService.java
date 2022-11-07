package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.user_info;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public int join(user_info userInfo) {
		return userMapper.join(userInfo);
	}
}
