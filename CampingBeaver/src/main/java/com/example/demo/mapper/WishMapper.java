package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.wishlist_info;

@Mapper
public interface WishMapper {
	public List<wishlist_info> wishList(String user_id);
}
