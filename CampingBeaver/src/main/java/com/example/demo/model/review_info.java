package com.example.demo.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class review_info {
	// 리뷰 순번 
    private int rv_seq;

    // 패키지 순번 
    private int pkg_seq;

    // 리뷰 내용 
    private String rv_content;

    // 리뷰 사진 
    private String rv_photo;

    // 리뷰 작성일자 
    private Timestamp rv_date;

    // 리뷰 별점 
    private int rv_rating;

    // 리뷰 작성자 
    private String user_id;
}
