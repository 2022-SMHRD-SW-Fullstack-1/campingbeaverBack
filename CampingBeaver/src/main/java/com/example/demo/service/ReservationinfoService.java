package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ReservationinfoMapper;

@Service
public class ReservationinfoService {
	@Autowired
	ReservationinfoMapper reservationinfoMapper;

	public void reserv(Map<String, Object> map) {
		reservationinfoMapper.reserv(map);
	}
}