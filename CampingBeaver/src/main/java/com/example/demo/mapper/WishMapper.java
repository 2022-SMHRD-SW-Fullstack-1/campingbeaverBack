package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.package_info;
import com.example.demo.model.wishlist_info;

@Mapper
public interface WishMapper {
	
	// 관심상품 불러오기
	public List<package_info> wishList(String user_id);
	
	
	// 관심상품 삭제하기
	public int deleteWish(wishlist_info reviewItem);
	
}
