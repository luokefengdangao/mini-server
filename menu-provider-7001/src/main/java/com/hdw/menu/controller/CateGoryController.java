package com.hdw.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdw.controller.BasicController;
import com.hdw.entites.CateGoryEntity;
import com.hdw.menu.service.CateGoryService;
import com.hdw.result.ResultRows;

@RestController
@RequestMapping("/category")
public class CateGoryController extends BasicController {

	@Autowired
	private CateGoryService cateGoryService;

	@GetMapping("/listAll")
	public ResultRows<CateGoryEntity> listAll() {
		List<CateGoryEntity> rows = cateGoryService.listAll();
		return this.createResultVO(rows);
	}

}
