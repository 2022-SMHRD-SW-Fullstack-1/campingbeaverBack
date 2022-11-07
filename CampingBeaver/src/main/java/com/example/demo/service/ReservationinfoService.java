package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ReservationinfoMapper;
import com.example.demo.model.basketlist;
import com.example.demo.model.reservation_info;
import com.example.demo.model.reservationlist;

@Service
public class ReservationinfoService {
	@Autowired
	ReservationinfoMapper reservationinfoMapper;

	public void reserv(Map<String, Object> map) {
		reservationinfoMapper.reserv(map);
	}
	
	public List<reservationlist> selectOrderCom(){
		return reservationinfoMapper.selectOrderCom();
	}
}