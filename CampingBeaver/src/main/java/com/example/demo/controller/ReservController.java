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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.reservation_info;
import com.example.demo.model.reservationlist;
import com.example.demo.service.ReservService;
import com.google.gson.Gson;

@CrossOrigin
@RestController
public class ReservController {
	
	Gson gson=new Gson();
	
	@Autowired
	ReservService reservService;
	
	@GetMapping("/reservlist/{user_id}")
	public List<reservation_info> reservList(@PathVariable("user_id") String user_id) {
		List<reservation_info> reservList = reservService.reservList(user_id);
		return reservList;
	}

	@GetMapping("/reserv/delete")
	public void reservDelete(@RequestParam int reserv_seq) {
		reservService.reservDelete(reserv_seq);
	}
	
	@PostMapping("/reserv")
	public void reserv(@RequestBody Map<String, Object> map) {
		String jsonStr=gson.toJson(map);
		reservService.reserv(map);
	}
	
	@GetMapping("/ordercom")
	public List<reservationlist> selectOrderCom(){
		return reservService.selectOrderCom();
	}
	
}
