package com.hdw.menu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdw.controller.BasicController;
import com.hdw.entites.AddrEntity;
import com.hdw.result.ResultRows;

@RestController
@RequestMapping("/consumer/addr")
public class AddrConsumerController extends BasicController{
	
	private final static String URL_PREFIX = "http://localhost:7001/addr/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getAddr")
	public ResultRows<AddrEntity> listAll(String userId) {
		
		@SuppressWarnings("unchecked")
		ResultRows<AddrEntity> resultRows = restTemplate.getForObject(URL_PREFIX + "getAddr?userId={userId}",
				ResultRows.class, userId);
		return resultRows;
	}
	
	

}
