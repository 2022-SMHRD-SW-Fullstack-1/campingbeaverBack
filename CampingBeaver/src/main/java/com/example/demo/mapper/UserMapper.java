package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.user_info;

@Mapper
public interface UserMapper {
	public int join(user_info userInfo);
}
