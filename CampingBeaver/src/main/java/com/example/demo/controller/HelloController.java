package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.campsite_info;
import com.example.demo.service.RecomService;

import com.example.demo.model.reservation_info;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.google.gson.Gson;


//@Controller
//public class HelloController {
//	
//	@RequestMapping(value="/main")
//	public void reservation(@RequestBody String reserv) {
//		System.out.println(reserv);
//	}
//	@PostMapping("/main")
//	public void reservation(@RequestBody HashMap<String, Object> map) {
//		System.out.println(map);
//	}
//}

@RestController
@RequestMapping("/")
public class HelloController {



	  Gson gson=new Gson();
	@PostMapping("main")
	public void reservation(@RequestBody Map<String, Object> map) {
    	String jsonStr=gson.toJson(map);
		System.out.println(jsonStr);
	}

	
//	@GetMapping("/main")
//	public String root() {
//		return "main";
//	}
//	@PostMapping("/main")
//	public com.example.demo.model.reservation_info reservation_info() {
//		com.example.demo.model.reservation_info reservation_info = new com.example.demo.model.reservation_info(1, "주상민", "2022-11-05", "2022-11-06");
//		return reservation_info;
//	}
//	@GetMapping("/beaver/main")
//	public void reservation(@RequestParam Integer reserv_seq, @RequestParam String user_id, @RequestParam Integer pkg_seq, @RequestParam String reserv_name, @RequestParam String reserv_addr, @RequestParam String reserv_post, @RequestParam String reserv_phone, @RequestParam Integer reserv_price, @RequestParam String reserv_pay, @RequestParam String reserv_s_date, @RequestParam String reserv_e_date ) {
//        System.out.println(reserv_seq);
//        System.out.println(user_id);
//        System.out.println(pkg_seq);
//        System.out.println(reserv_name);
//        System.out.println(reserv_addr);
//        System.out.println(reserv_post);
//        System.out.println(reserv_phone);
//        System.out.println(reserv_price);
//        System.out.println(reserv_pay);
//        System.out.println(reserv_s_date);
//        System.out.println(reserv_e_date);
//	}

	

	

}

