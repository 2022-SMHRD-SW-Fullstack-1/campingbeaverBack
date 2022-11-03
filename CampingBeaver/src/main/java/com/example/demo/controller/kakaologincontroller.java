package com.example.demo.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.kakao.KakaoUserInfo;
import com.example.demo.model.user_info;
import com.example.demo.service.PackageinfoService;
import com.example.demo.service.UserinfoService;
import com.google.gson.Gson;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;



//import com.example.demo.kakao.KakaoLoginService;

@RestController
@RequestMapping(value="/")
public class kakaologincontroller {
	
//	@Autowired
//	KakaoLoginService kakakologinservice;
	
//	@GetMapping("/kakaologin")
//	public String kakaologin(){
//		System.out.println("안녕안녕");
//		
//		return "Spring Boot and React 연동 테스트\n";
//	}
	
	//react에서 access_token 받아왔음
	@PostMapping("/kakaologin")
	public void reservation(@RequestBody String reserv) {
		System.out.println("boot enter");
		System.out.println(reserv);
		
	}
	
	@GetMapping("/test")
	public void test() {
		try {
			KakaoUserInfo.kakaouserinfo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Autowired
	UserinfoService userinfoService;
	
	@PostMapping("/sign")
	public int sign(@RequestBody String reserv) {
		
		Gson gson = new Gson();
		
		user_info userinfo = gson.fromJson(reserv, user_info.class);
		
		System.out.println(userinfo);
		System.out.println(userinfo.getUser_id());
		
		System.out.println(reserv);
		
		return userinfoService.sign(userinfo);
		
	}
	

	
}
