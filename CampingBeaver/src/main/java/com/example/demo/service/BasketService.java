package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BasketMapper;
import com.example.demo.model.basket_info;
import com.example.demo.model.package_info;

@Service
public class BasketService {
	
	@Autowired
	BasketMapper basketMapper;
	
//	public void basketListAdd() {
//		basketMapper.basketListAdd();
//	}
	
	public List<basket_info> basketList(String user_id) {
		return basketMapper.basketList(user_id);
	}
	
	public List<basket_info> selectBasketList(){
		return basketMapper.selectBasketList();
	}
}
