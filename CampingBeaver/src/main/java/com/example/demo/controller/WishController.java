package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.package_info;
import com.example.demo.model.wishlist_info;
import com.example.demo.service.WishService;

@CrossOrigin
@RestController
public class WishController {
	@Autowired
	WishService wishService;
	
//	@GetMapping("/wishlist/{user_id}")
//	public void findId(@PathVariable("user_id") String user_id) {
//		System.out.println("id : " + user_id);
//	}
	
	@GetMapping("/wishlist/{user_id}")
	public List<package_info> wishList(@PathVariable("user_id") String user_id, Model model) {
		List<package_info> wishItemList = wishService.wishList(user_id);	
		return wishItemList;
	}
	
	//@PostMapping("/wishlist/admin")
//	public List<wishlist_info> wishList(){
//		@RequestBody String user_id, Model model){
//		model.addAttribute("wishList", wishService.wishList(user_id));
//		
//		return wishService.wishList();

}