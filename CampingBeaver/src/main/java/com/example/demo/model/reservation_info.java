package com.example.demo.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class reservation_info {
	
	// 예약 순번 
    private int reserv_seq;

    // 예약자 아이디 
    private String user_id;

    // 패키지 순번 
    private int pkg_seq;

    // 예약자 이름 
    private String reserv_name;

    // 예약자 주소 
    private String reserv_addr;

    // 예약자 우편번호 
    private String reserv_post;

    // 예약자 연락처 
    private String reserv_phone;

    // 결제 액 
    private int reserv_price;

    // 결제 수단 
    private String reserv_pay;

    // 예약시작일자 
    private Timestamp reserv_s_date;

    // 예약종료일자 
    private Timestamp reserv_e_date;
}
