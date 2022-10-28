package com.example.demo.model;

import lombok.Data;

@Data
public class option_info {
	 // 옵션 순번 
    private int option_seq;

    // 옵션 명 
    private String option_name;

    // 옵션 수량 
    private int option_cnt;
}
