package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.review_info;

@Controller
public class ReviewController {
	@PostMapping("/write/{resnum}")
	public void writeReview(@PathVariable("resnum") String resnum, 
							@ModelAttribute review_info review) {
	
		System.out.println(" 예약번호 : " + resnum);
		System.out.println(" 리뷰 : " + review);
	}
}
