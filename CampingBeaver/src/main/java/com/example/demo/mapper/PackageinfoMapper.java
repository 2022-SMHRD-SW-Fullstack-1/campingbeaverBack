package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.package_info;

@Mapper
public interface PackageinfoMapper {
	
	public List<package_info> selectPkgList();
	
	public List<package_info> storeDetail(int storeDetail);

}
