package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ReviewMapper;
import com.example.demo.model.review_info;

@Service
public class ReviewService {
	@Autowired
	ReviewMapper reviewMapper;
	
	public int writeReview(review_info reviewItem) {
		
		return reviewMapper.writeReview(reviewItem);
	}
	
	public List<review_info> selectAllReview(String user_id){
		return reviewMapper.selectAllReview(user_id);
	}
	
	public int deleteReview(review_info deleteItem) {
		return reviewMapper.deleteReview(deleteItem);
	}
	
	public List<review_info> selectReview(int pkg_seq){
		return reviewMapper.selectReview(pkg_seq);
	}
	
}
