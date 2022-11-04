package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ReservMapper;

@Service
public class ReservService {
	@Autowired
	ReservMapper reservMapper;
	
	public void reserv(Map<String, Object> map) {
		reservMapper.reserv(map);
	}
}
