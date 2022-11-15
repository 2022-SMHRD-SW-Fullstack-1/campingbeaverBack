package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.package_info;
import com.example.demo.model.wishlist_info;
import com.example.demo.service.WishService;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin
@RestController
public class WishController {
	@Autowired
	WishService wishService;
	
	@GetMapping("/wishlist/{user_id}")
	public List<package_info> wishList(@PathVariable("user_id") String user_id, Model model) {
		List<package_info> wishItemList = wishService.wishList(user_id);	
		return wishItemList;
	}
	
	@PostMapping("/wishlist/delete")
	public void deleteWish(@RequestBody Map<String, Object> delete) {
		ObjectMapper mapper = new ObjectMapper();
		wishlist_info deleteItem = mapper.convertValue(delete, wishlist_info.class);
		wishService.deleteWish(deleteItem);
	}
	
	@PostMapping("/wishlist/add")
	public void addWish(@RequestBody Map<String, Object> add) {
		ObjectMapper mapper = new ObjectMapper();
		wishlist_info addItem = mapper.convertValue(add, wishlist_info.class);
		wishService.addWish(addItem);
	}
	

}