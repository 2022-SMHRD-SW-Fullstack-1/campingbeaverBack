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
	
	// 리뷰 작성하기
	public int writeReview(review_info reviewItem) {
		
		return reviewMapper.writeReview(reviewItem);
	}
	
	// 리뷰목록 불러오기
	public List<review_info> selectAllReview(String user_id){
		return reviewMapper.selectAllReview(user_id);
	}
	
	// 리뷰 삭제하기
	public int deleteReview(review_info deleteItem) {
		return reviewMapper.deleteReview(deleteItem);
	}
	
}
