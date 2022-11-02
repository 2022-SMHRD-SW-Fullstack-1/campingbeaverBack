package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.reservation_info;

@Mapper
public interface ReservMapper {
	public List<reservation_info> reservList(String user_id);
}
