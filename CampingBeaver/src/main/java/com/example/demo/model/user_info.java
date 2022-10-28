package com.example.demo.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class user_info {
	// 회원 아이디 
	private String user_id;
	// 회원 비밀번호 
	private String user_pw;
	// 회원 이름 
	private String user_name;
	// 회원 전화번호
	private String user_phone;
	// 회원 주소
	private String user_addr;
	// 회원 가입유형 
	private String user_type;
	// 회원 가입일자
	private Timestamp user_joindate;
	

}
