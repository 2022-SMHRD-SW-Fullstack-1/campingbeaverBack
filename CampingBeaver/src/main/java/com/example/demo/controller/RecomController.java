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
		return 	recomService.selectOneRecom(site_seq);
	}
	
	@GetMapping("/hash")
	public List<campsite_info> searchHashTag(){
		return recomService.searchHashTag();
	}
}
