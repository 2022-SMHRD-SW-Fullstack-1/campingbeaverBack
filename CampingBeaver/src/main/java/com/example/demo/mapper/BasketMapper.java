package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.basket_info;
import com.example.demo.model.basketlist;
import com.example.demo.model.package_info;

@Mapper
public interface BasketMapper {
	//장바구니 추가
	public void cartAdd(Map<String, Object> map);
	
	//장바구니 삭제
	public void cartDelete(int basket_seq);
	
	//장바구니 출력
	public List<basketlist> selectBasketList(String user_id);
}
