package com.example.demo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationinfoMapper {
	public void reserv(Map<String, Object> map);
}