package com.example.demo.model;

import lombok.Data;

@Data
public class package_info {
	 // 패키지 순번 
    private int pkg_seq;

    // 패키지 명 
    private String pkg_name;

    // 패키지 분류 
    private String pkg_type;

    // 패키지 재고수량 
    private int pkg_cnt;

    // 패키지 가격 
    private int pkg_price;

    // 패키지 해시태그 
    private String pkg_hash;

    // 패키지 사진
    private String pkg_photo;
    
    public package_info(String pkg_name, int pkg_price, String pkg_photo) {
    	this.pkg_name = pkg_name;
    	this.pkg_price = pkg_price;
    	this.pkg_photo = pkg_photo;
    }
}
