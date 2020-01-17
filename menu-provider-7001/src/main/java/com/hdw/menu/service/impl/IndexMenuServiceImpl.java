package com.hdw.menu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdw.entites.IndexMenuEntity;
import com.hdw.menu.mapper.IndexMenuMapper;
import com.hdw.menu.service.IndexMenuService;

@Service
public class IndexMenuServiceImpl implements IndexMenuService{

	@Autowired
	private IndexMenuMapper mapper;
	
	@Override
	public List<IndexMenuEntity> listAll() {
	
		return mapper.selectAll();
	}

}
