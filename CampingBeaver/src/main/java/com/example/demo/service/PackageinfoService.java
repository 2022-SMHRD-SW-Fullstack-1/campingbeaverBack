package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PackageinfoMapper;
import com.example.demo.model.package_info;

@Service
public class PackageinfoService {
	
	@Autowired
	PackageinfoMapper packageinfoMapper;
	
	public List<package_info> selectPkgList(){
		return packageinfoMapper.selectPkgList();
	}
	
	public List<package_info> storeDetail(int detailNum){
		return packageinfoMapper.storeDetail(detailNum);
	}

}
