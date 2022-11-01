package com.example.demo.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
