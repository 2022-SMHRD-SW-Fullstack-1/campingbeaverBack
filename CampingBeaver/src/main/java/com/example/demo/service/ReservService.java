package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ReservMapper;
import com.example.demo.model.reservation_info;

@Service
public class ReservService {
	@Autowired
	ReservMapper reservMapper;
	
	public List<reservation_info> reservList(String user_id){
		return reservMapper.reservList(user_id);
	}
	
	public void reservDelete(int reserv_seq) {
		reservMapper.reservDelete(reserv_seq);
	}
}
