package com.hdw.menu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdw.controller.BasicController;
import com.hdw.entites.IndexMenuEntity;
import com.hdw.result.ResultRows;

@RestController
@RequestMapping("/consumer/index/menu")
public class MenuConsumerController extends BasicController{
	
	private final static String URL_PREFIX="http://localhost:7001/index/menu/"; 
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/listAll")
	public ResultRows<IndexMenuEntity> listAll(){
		
		@SuppressWarnings("unchecked")
		ResultRows<IndexMenuEntity> resultRows = restTemplate.getForObject(URL_PREFIX +"listAll", ResultRows.class);
		return resultRows;
	}
	
	

}
