package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BasketMapper;

@Service
public class BasketService {
	
	@Autowired
	BasketMapper basketMapper;
	
	public void basketAdd() {
		basketMapper.basketAdd();
	}

}
