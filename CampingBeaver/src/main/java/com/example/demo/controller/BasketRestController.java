package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.basket_info;
import com.example.demo.model.package_info;
import com.example.demo.service.BasketService;
import com.google.gson.Gson;

@RestController
public class BasketRestController {
	Gson gson = new Gson();
	
	@Autowired
	BasketService basketService;
	
	@PostMapping("/basketadd")
	public void basketListAdd(@RequestBody Map<String, Object> map) {
		basketService.basketListAdd();
		String jsonStr=gson.toJson(map);
		System.out.println(jsonStr);
	}
//	@GetMapping("/add/{user_id}")
//	public void basketListAdd(@PathVariable("user_id") String user_id, int pkg_seq) {
//		
//	}
	@PostMapping("/listpage/{user_id}")
	public List<basket_info> basketList(@PathVariable("user_id") String user_id, Model model) {
		List<basket_info> basketItemList = basketService.basketList(user_id);	
		return basketItemList;
	}
	@GetMapping("/basketlist")
	public List<basket_info> selectBasketList(){
		return basketService.selectBasketList();
	}
	
}
