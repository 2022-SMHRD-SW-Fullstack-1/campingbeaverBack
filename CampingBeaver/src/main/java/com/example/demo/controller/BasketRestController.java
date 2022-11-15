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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.basket_info;
import com.example.demo.model.basketlist;
import com.example.demo.model.package_info;
import com.example.demo.service.BasketService;
import com.google.gson.Gson;

@RestController
public class BasketRestController {
	Gson gson = new Gson();
	
	@Autowired
	BasketService basketService;
	
	@PostMapping("/cartadd")
	public void cartAdd(@RequestBody Map<String, Object> map) {
		String jsonStr=gson.toJson(map);
		basketService.cartAdd(map);
	}
	
	@GetMapping("/cartdelete")
	public void cartDelete(@RequestParam int basket_seq) {
		basketService.cartDelete(basket_seq);
	}
	
	@GetMapping("/basketlist{user_id}")
	public List<basketlist> selectBasketList(@PathVariable("user_id") String user_id, Model model){
		List<basketlist> basketSelList = basketService.selectBasketList(user_id);
		return basketSelList;
	}
	
}
