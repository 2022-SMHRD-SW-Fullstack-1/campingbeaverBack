package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.reservation_info;
import com.example.demo.model.reservationlist;

@Mapper
public interface ReservationinfoMapper {
	public void reserv(Map<String, Object> map);
	
	public List<reservationlist> selectOrderCom();
}