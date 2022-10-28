package com.example.demo.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class basket_info {

	// 장바구니 순번 
    private int basket_seq;

    // 회원 아이디 
    private String user_id;

    // 패키지 순번 
    private int pkg_seq;

    // 등록 일자 
    private Timestamp reg_date;
}
