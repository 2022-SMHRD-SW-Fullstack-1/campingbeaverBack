package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.review_info;

@Mapper
public interface ReviewMapper {
	
	public int writeReview(review_info reviewItem);
	
	public List<review_info> selectAllReview(String user_id);
	
	public int deleteReview(review_info reviewItem);
	
	public List<review_info> selectReview(int pkg_seq);
}
