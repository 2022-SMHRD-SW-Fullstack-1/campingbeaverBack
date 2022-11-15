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
	
	@PostMapping("/rvwrite/{resnum}")
	public void writeReview(
			@PathVariable("resnum") String resnum, 
			@RequestBody Map<String, Object> review) {
		ObjectMapper mapper = new ObjectMapper();
		review_info reviewItem = mapper.convertValue(review, review_info.class);
		reviewService.writeReview(reviewItem);
		
	}
	
	@GetMapping("/reviewlist/{user_id}")
	public List<review_info> reviewList(@PathVariable("user_id") String user_id) {
		List<review_info> reviewItemList = reviewService.selectAllReview(user_id);
		return reviewItemList;
	}
	
	@PostMapping("/reviewlist/delete")
	public void deleteReview(@RequestBody Map<String, Object> delete) {
		ObjectMapper mapper = new ObjectMapper();
		review_info deleteItem = mapper.convertValue(delete, review_info.class);
		reviewService.deleteReview(deleteItem);
	}
	
	@GetMapping("/storedetail/review/{pkg_seq}")
	public List<review_info> selectReview(@PathVariable("pkg_seq") String pkgSeq) {
		int pkg_seq = Integer.parseInt(pkgSeq);
		List<review_info> selectReviewItemList = reviewService.selectReview(pkg_seq);
		return selectReviewItemList;
	}
	
}
