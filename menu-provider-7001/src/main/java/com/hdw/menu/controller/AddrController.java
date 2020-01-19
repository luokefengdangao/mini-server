package com.hdw.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdw.controller.BasicController;
import com.hdw.entites.AddrEntity;
import com.hdw.menu.service.AddrService;
import com.hdw.result.ResultRows;

@RestController
@RequestMapping("/addr")
public class AddrController extends BasicController {

	@Autowired
	private AddrService addrService;

	@GetMapping("/getAddr")
	public ResultRows<AddrEntity> getAddr(String userId) {
		List<AddrEntity> rows = addrService.getAddr(userId);
		return this.createResultVO(rows);
	}

}
