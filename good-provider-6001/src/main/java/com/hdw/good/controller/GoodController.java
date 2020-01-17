package com.hdw.good.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdw.controller.BasicController;
import com.hdw.entites.IndexMenuGoodEntity;
import com.hdw.good.service.GoodService;
import com.hdw.result.ResultRows;

@RestController
@RequestMapping("/good")
public class GoodController extends BasicController {

	@Autowired
	private GoodService goodService;

	@GetMapping("/getIndexMenuGood")
	public ResultRows<IndexMenuGoodEntity> getIndexMenuGood() {
		List<IndexMenuGoodEntity> rows = goodService.listIndexMenuGood();
		return this.createResultVO(rows);

	}

}
