package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.review_info;
import com.example.demo.service.ReviewService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ReviewController {
	@Autowired
	ReviewService reviewService;
	
	// 리뷰 작성하기
	@PostMapping("/rvwrite/{resnum}")
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
	
	// 리뷰 불러오기
	@GetMapping("/reviewlist/{user_id}")
	public List<review_info> reviewList(@PathVariable("user_id") String user_id) {
		List<review_info> reviewItemList = reviewService.selectAllReview(user_id);
		return reviewItemList;
	}
	
	// 리뷰 삭제하기
	@PostMapping("/reviewlist/delete")
	public void deleteReview(@RequestBody Map<String, Object> delete) {
		
		ObjectMapper mapper = new ObjectMapper();
		review_info deleteItem = mapper.convertValue(delete, review_info.class);
		reviewService.deleteReview(deleteItem);
	}
	
}
