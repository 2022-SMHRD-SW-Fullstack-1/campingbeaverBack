package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ReservService;
import com.google.gson.Gson;

@RestController
public class ReservController {
	Gson gson=new Gson();
	@Autowired
	ReservService reservService;

	@PostMapping("/reserv")
	public void reserv(@RequestBody Map<String, Object> map) {
		String jsonStr=gson.toJson(map);
		System.out.println(jsonStr);
		reservService.reserv(map);
	}

}