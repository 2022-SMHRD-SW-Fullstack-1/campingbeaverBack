package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.package_info;
import com.example.demo.model.wishlist_info;

@Mapper
public interface WishMapper {
	
	public List<package_info> wishList(String user_id);
	
	public int deleteWish(wishlist_info reviewItem);
	
	public int addWish(wishlist_info addItem);
	
}
