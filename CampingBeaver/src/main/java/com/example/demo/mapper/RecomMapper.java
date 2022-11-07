package com.example.demo.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.campsite_info;

@Mapper
public interface RecomMapper {
	
	//캠핑장 추천 등록 번호로 정보 불러오는 메서드
	public campsite_info selectOneRecom(int site_seq);
	
	//해시태그로 캠핑장 검색
	public List<campsite_info> searchHashTag();
	
}
