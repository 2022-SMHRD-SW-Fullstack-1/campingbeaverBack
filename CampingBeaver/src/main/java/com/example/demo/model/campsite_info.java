package com.example.demo.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class campsite_info {
	 // 캠핑장 순번 
    private Integer site_seq;

    // 캠핑장 명 
    private String site_name;

    // 캠핑장 주소 
    private String site_addr;

    // 캠핑장 유형 
    private String site_type;

    // 캠핑장 시설정보 
    private String site_facility;

    // 캠핑장 바닥형태 
    private String site_floor;

    // 캠핑장 주변정보 
    private String site_around;

    // 캠핑장 기타정보 
    private String site_etc;

    // 캠핑장 사이트크기 
    private String site_size;

    // 캠핑장 해시태그 
    private String site_hash;

    // 캠핑장 위도 
    private BigDecimal site_lat;

    // 캠핑장 경도 
    private BigDecimal site_lng;

    // 관리자 아이디 
    private String admin_id;

    public campsite_info(Integer site_seq) {
    	super();
    	this.site_seq = site_seq;
    }
    

    
}
