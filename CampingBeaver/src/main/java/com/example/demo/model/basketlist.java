package com.example.demo.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class basketlist {
	private int pkg_seq;
	private String pkg_name;
	private String pkg_type;
	private int pkg_cnt;
	private int pkg_price;
	private String pkg_hash;
	private String pkg_photo;
	private int basket_seq;
	private String user_id;
	private Timestamp reg_date;
}
