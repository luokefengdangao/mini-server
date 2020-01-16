package com.hdw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdw.entites.AdEntity;
import com.hdw.result.ResultRows;



@RestController
@RequestMapping("/consumer/ad")
public class AdConsumerController {
	
	 private static final String REST_URL_PREFIX = "http://localhost:8001/ad";
	 
	 @Autowired
	 private RestTemplate restTemplate;
	 
	 @RequestMapping("/listAll")
	 public ResultRows<AdEntity> list(){
		 
		@SuppressWarnings("unchecked")
		ResultRows<AdEntity> resultRows = restTemplate.getForObject(REST_URL_PREFIX + "/listAll", ResultRows.class);
		return resultRows;
		 
	 }
}
