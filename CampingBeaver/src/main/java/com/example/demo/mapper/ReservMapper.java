package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.reservation_info;
import com.example.demo.model.reservationlist;

@Mapper
public interface ReservMapper {
	public List<reservation_info> reservList(String user_id);
	
	public void reservDelete(int reserv_seq);
	
	public void reserv(Map<String, Object> map);
	
	public List<reservationlist> selectOrderCom();
}
