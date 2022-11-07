package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.campsite_info;
import com.example.demo.service.RecomService;
import com.google.gson.Gson;

import lombok.ToString;


@RestController
public class RecomController {
	
	@Autowired
	RecomService recomService;
	
	Gson gson=new Gson();
	@GetMapping("/recomdetail")
	public campsite_info campsite_info(@RequestParam int site_seq) {
		System.out.println(site_seq);
//		recomService.selectOneRecom(site_seq);
//		campsite_info campsite_info = new campsite_info(site_seq);
		
		return 	recomService.selectOneRecom(site_seq);
	}
	

//	@PostMapping("/hash")
//	public void getHashTag(@RequestBody List<Object> hashList) {
//		System.out.println(hashList);
//		recomService.searchHashTag(hashList);
////		return hashList;
//	}


	
	@GetMapping("/hash")
	public List<campsite_info> searchHashTag(){
		return recomService.searchHashTag();
	}
//	
	
	
}
