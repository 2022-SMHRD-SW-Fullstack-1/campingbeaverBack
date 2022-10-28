package com.example.demo.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class campsite_info {
	 // 캠핑장 순번 
    private int siteSeq;

    // 캠핑장 명 
    private String siteName;

    // 캠핑장 주소 
    private String siteAddr;

    // 캠핑장 유형 
    private String siteType;

    // 캠핑장 시설정보 
    private String siteFacility;

    // 캠핑장 바닥형태 
    private String siteFlorr;

    // 캠핑장 주변정보 
    private String siteAround;

    // 캠핑장 기타정보 
    private String siteEtc;

    // 캠핑장 사이트크기 
    private String siteSize;

    // 캠핑장 해시태그 
    private String siteHash;

    // 캠핑장 위도 
    private BigDecimal siteLat;

    // 캠핑장 경도 
    private BigDecimal siteLng;

    // 관리자 아이디 
    private String adminId;

}
