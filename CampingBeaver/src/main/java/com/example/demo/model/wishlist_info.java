package com.example.demo.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class wishlist_info {

	 // 관심 순번 
    private int wl_seq;

    // 패키지 순번 
    private int pkg_seq;

    // 회원 아이디 
    private String user_id;

    // 등록 일자 
    private Timestamp reg_date;
	
}
