package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.WishMapper;
import com.example.demo.model.package_info;
import com.example.demo.model.wishlist_info;


@Service
public class WishService {
	@Autowired
	WishMapper wishMapper;
	
	public List<package_info> wishList(String user_id) {
		return wishMapper.wishList(user_id);
	}
	
	public int deleteWish(wishlist_info deleteItem) {
		return wishMapper.deleteWish(deleteItem);
	}
	
	public int addWish(wishlist_info addItem) {
		return wishMapper.addWish(addItem);
	}
}
