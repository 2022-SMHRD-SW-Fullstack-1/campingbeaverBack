package com.example.demo.service;

import java.util.List;
import java.util.Map;

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
}
