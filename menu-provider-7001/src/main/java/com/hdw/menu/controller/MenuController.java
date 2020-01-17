package com.hdw.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdw.controller.BasicController;
import com.hdw.entites.IndexMenuEntity;
import com.hdw.menu.service.IndexMenuService;
import com.hdw.result.ResultRows;

@RestController
@RequestMapping("/index/menu")
public class MenuController extends BasicController{
	
	@Autowired
	private IndexMenuService indexMenuService;
	
	@GetMapping("/listAll")
	public ResultRows<IndexMenuEntity> listAll(){
		
		ResultRows<IndexMenuEntity> resultRows = new ResultRows<IndexMenuEntity>();
		List<IndexMenuEntity> rows = indexMenuService.listAll();
		resultRows.setRows(rows);
		return resultRows;
		
	}

}
