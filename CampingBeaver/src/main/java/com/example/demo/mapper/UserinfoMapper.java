package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.user_info;

@Mapper
public interface UserinfoMapper {

	public int sign(user_info userinfo);

	
}
