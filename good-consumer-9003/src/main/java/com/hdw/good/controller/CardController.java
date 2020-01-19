package com.hdw.good.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdw.entites.CardEntity;
import com.hdw.entites.GoodEntity;
import com.hdw.result.ResultData;
import com.hdw.result.ResultRows;

@RestController
@RequestMapping("/card")
public class CardController {

	@Autowired
	private RestTemplate restTemplate;

	private final static String URL_PREFIX = "http://localhost:6001/card/";

	@SuppressWarnings("unchecked")
	@PostMapping("/save")
	public ResultData<CardEntity> save(HttpServletRequest request, String card) {
		

		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<>();
		paramMap.add("card", card);
		return restTemplate.postForObject(URL_PREFIX + "save", paramMap, ResultData.class);

	}

	@SuppressWarnings("unchecked")
	@GetMapping("/list")
	public ResultRows<GoodEntity> getCardGood(String userId) {

		return restTemplate.getForObject(URL_PREFIX + "list?userId={userId}", ResultRows.class, userId);

	}

}
