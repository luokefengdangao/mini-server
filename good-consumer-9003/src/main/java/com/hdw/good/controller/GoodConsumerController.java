package com.hdw.good.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdw.entites.IndexMenuGoodEntity;
import com.hdw.result.ResultRows;

@RestController
@RequestMapping("/good")
public class GoodConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	private final static String URL_PREFIX = "http://localhost:6001/good/";

	@SuppressWarnings("unchecked")
	@GetMapping("/getIndexMenuGood")
	public ResultRows<IndexMenuGoodEntity> getIndexMenuGood() {
		return restTemplate.getForObject(URL_PREFIX + "getIndexMenuGood", ResultRows.class);
	}

}
