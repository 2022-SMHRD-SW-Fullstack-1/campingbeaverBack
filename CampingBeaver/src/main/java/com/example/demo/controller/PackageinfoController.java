package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.package_info;
import com.example.demo.service.PackageinfoService;

@RestController
public class PackageinfoController {
	
	@Autowired
	PackageinfoService packageinfoService;
	
	@GetMapping("/pkglist")
	public List<package_info> selectPkgList(){
		return packageinfoService.selectPkgList();
	}
	@GetMapping("/storedetail{detailNum}")
	public List<package_info> storeDetail(@PathVariable("detailNum") int detailNum, Model model){
		List<package_info> storeItem = packageinfoService.storeDetail(detailNum);
		return storeItem;
	}
}
