package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BasketMapper;
import com.example.demo.model.basket_info;
import com.example.demo.model.basketlist;
import com.example.demo.model.package_info;

@Service
public class BasketService {
	
	@Autowired
	BasketMapper basketMapper;
	
	//장바구니 추가
	public void cartAdd(Map<String, Object> map) {
		basketMapper.cartAdd(map);
	}
	
	//장바구니 삭제
	public void cartDelete(int basket_seq) {
		System.out.println(basket_seq);
		basketMapper.cartDelete(basket_seq);
	}
	
	//장바구니 출력
	public List<basketlist> selectBasketList(String user_id){
		return basketMapper.selectBasketList(user_id);
	}
}
