package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.review_info;

@Mapper
public interface ReviewMapper {
	public int writeReview(review_info reviewItem);
}
