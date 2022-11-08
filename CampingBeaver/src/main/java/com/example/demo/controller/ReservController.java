package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.reservation_info;
import com.example.demo.service.ReservService;

@CrossOrigin
@RestController
public class ReservController {
	
	@Autowired
	ReservService reservService;
	
	@GetMapping("/reservlist/{user_id}")
	public List<reservation_info> reservList(@PathVariable("user_id") String user_id) {
		List<reservation_info> reservList = reservService.reservList(user_id);
		return reservList;
	}
	
	@GetMapping("/reserv/delete")
	public void reservDelete(@RequestParam int reserv_seq) {
		System.out.println(reserv_seq);
		reservService.reservDelete(reserv_seq);
	}
	
}
