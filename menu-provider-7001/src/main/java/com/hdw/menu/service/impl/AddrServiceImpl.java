package com.hdw.menu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdw.entites.AddrEntity;
import com.hdw.menu.mapper.AddrMapper;
import com.hdw.menu.service.AddrService;

@Service
public class AddrServiceImpl implements AddrService {

	@Autowired
	private AddrMapper mapper;

	@Override
	public List<AddrEntity> getAddr(String userId) {
		return mapper.selectAll();
	}

}
