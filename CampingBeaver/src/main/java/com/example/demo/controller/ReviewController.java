package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.review_info;
import com.example.demo.service.ReviewService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@RestController
public class ReviewController {
	@Autowired
	ReviewService reviewService;
	
	@PostMapping("/write/{resnum}")
	public void writeReview(
			@PathVariable("resnum") String resnum, 
			@RequestBody Map<String, Object> review) {
		
		//System.out.println("map : "+ review.toString());
		//System.out.println(" 예약번호 : " + resnum);
		//System.out.println(" 리뷰 : " + gson.toJson(review));
		ObjectMapper mapper = new ObjectMapper();
		review_info reviewItem = mapper.convertValue(review, review_info.class);
		
		//System.out.println(reviewItem.toString());
		reviewService.writeReview(reviewItem);
		
	}
}
