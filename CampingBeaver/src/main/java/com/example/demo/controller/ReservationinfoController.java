package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.basketlist;
import com.example.demo.model.reservation_info;
import com.example.demo.model.reservationlist;
import com.example.demo.service.ReservationinfoService;
import com.google.gson.Gson;

@RestController
public class ReservationinfoController {
	Gson gson=new Gson();
	@Autowired
	ReservationinfoService reservationinfoService;

	@PostMapping("/reserv")
	public void reserv(@RequestBody Map<String, Object> map) {
		String jsonStr=gson.toJson(map);
		System.out.println(jsonStr);
		reservationinfoService.reserv(map);
	}
	
	@GetMapping("/ordercom")
	public List<reservationlist> selectOrderCom(){
		return reservationinfoService.selectOrderCom();
	}
}