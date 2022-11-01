package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.review_info;

@Mapper
public interface ReviewMapper {
	public review_info write(review_info reviewInfo);
}
