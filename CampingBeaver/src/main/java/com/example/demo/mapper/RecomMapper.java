package com.example.demo.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.campsite_info;

@Mapper
public interface RecomMapper {
	
	public campsite_info selectOneRecom(int site_seq);

	public List<campsite_info> searchHashTag();
	
}
