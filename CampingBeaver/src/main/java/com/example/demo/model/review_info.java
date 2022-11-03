package com.example.demo.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
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
    
    // 예약 번호
    private String reserv_num;
    

    // 리뷰
    public review_info(String reserv_num,int pkg_seq, String rv_content, 
    		int rv_rating, String rv_photo, String user_id) {
    	this.reserv_num = reserv_num;
    	this.rv_content = rv_content;
    	this.rv_rating = rv_rating;
    	this.rv_photo = rv_photo;
    	this.user_id = user_id;
    	this.pkg_seq = pkg_seq;  	
    }
}
