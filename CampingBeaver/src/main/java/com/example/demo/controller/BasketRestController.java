package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BasketService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/basket")
public class BasketRestController {
	Gson gson = new Gson();
	
	@Autowired
	BasketService basketService;
	
	@PostMapping("/add")
	public void basketAdd(@RequestBody Map<String, Object> map) {
		basketService.basketAdd();
		String jsonStr=gson.toJson(map);
		System.out.println(jsonStr);
	}
	
}
