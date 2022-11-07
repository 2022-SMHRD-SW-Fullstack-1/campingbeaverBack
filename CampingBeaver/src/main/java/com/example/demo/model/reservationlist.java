package com.example.demo.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class reservationlist {
	private int reserv_seq;
	private Timestamp reserv_date;
	private String user_id;
	private int pkg_seq;
	private String reserv_name;
	private String reserv_addr;
	private String reserv_post;
	private String reserv_phone;
	private int reserv_price;
	private String reserv_pay;
	private Timestamp reserv_s_date;
	private Timestamp reserv_e_date;
}
