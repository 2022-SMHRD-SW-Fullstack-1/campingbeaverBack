package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.review_info;

@Mapper
public interface ReviewMapper {
	
	// 리뷰 작성하기
	public int writeReview(review_info reviewItem);
	
	// 리뷰 불러오기
	public List<review_info> selectAllReview(String user_id);
}
