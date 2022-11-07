package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.RecomMapper;
import com.example.demo.model.campsite_info;

@Service
public class RecomService {

	//외부에서 생성된 객체 주입
	@Autowired
	RecomMapper recomMapper;
	
	
	public campsite_info selectOneRecom(int site_seq) {
		return recomMapper.selectOneRecom(site_seq);
	}
	
	public List<campsite_info> searchHashTag(){
//		System.out.println(hashList.size());
		return recomMapper.searchHashTag();
	}
}
