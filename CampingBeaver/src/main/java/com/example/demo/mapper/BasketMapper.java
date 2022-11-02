package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.basket_info;
import com.example.demo.model.package_info;

@Mapper
public interface BasketMapper {
//	public void basketListAdd();
	
	public List<basket_info> basketList(String user_id);
	
	public List<basket_info> selectBasketList();
}
