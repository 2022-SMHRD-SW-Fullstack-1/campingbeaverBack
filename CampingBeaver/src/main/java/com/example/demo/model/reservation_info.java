package com.example.demo.model;

import java.util.Date;

import lombok.Data;

@Data
public class reservation_info {
	
	// 예약 순번 
    private int reserv_seq;
    
    // 예약 날짜
    private String reserv_date;
    
    // 예약자 아이디 
    private String user_id;

    // 패키지 순번 
    private long pkg_seq;

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
//    private Timestamp reserv_s_date;
    private String reserv_s_date;

    // 예약종료일자 
//    private Timestamp reserv_e_date;
    private String reserv_e_date;
    
    // 예약 번호
    private String reserv_num;
    
    //예약
    public reservation_info(String reserv_name, String user_id, String reserv_s_date, String reserv_e_date) {
    	super();
    	this.reserv_name= reserv_name;
    	this.user_id = user_id;
    	this.reserv_s_date = reserv_s_date;
    	this.reserv_e_date = reserv_e_date;
    }
    
    // 예약목록 
    public reservation_info(String reserv_num, String reserv_date, String reserv_name, int reserv_price, long pkg_seq) {
    	this.reserv_num = reserv_num;
    	this.reserv_date = reserv_date;
    	this.reserv_name = reserv_name;
    	this.reserv_price = reserv_price;
    	this.pkg_seq = pkg_seq;
    }
    
}
