package com.hdw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdw.entites.AdEntity;
import com.hdw.result.ResultRows;
import com.hdw.service.AdService;

@RequestMapping("/ad")
@RestController
public class AdController {
	
	@Autowired
	private AdService adService;
	
	@GetMapping("/listAll")
	public ResultRows<AdEntity> list(){
		List<AdEntity> list = adService.list();
		ResultRows<AdEntity> resultRows = new ResultRows<AdEntity>();
		resultRows.setRows(list);
		return resultRows;
	}

}
