package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.package_info;

@Mapper
public interface WishMapper {
	public List<package_info> wishList(String user_id);
}
