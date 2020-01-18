package com.hdw.good.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdw.controller.BasicController;
import com.hdw.good.service.CardService;
import com.hdw.result.ResultData;

@RestController
@RequestMapping("/card")
public class CardController extends BasicController {

	@Autowired
	private CardService cardService;

	@PostMapping("/save")
	public ResultData<Boolean> save(String card) {
		boolean insert = cardService.insert(card);
		return this.createResultData(insert);
	}

}
