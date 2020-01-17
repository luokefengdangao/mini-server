package com.hdw.menu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdw.entites.CateGoryEntity;
import com.hdw.menu.mapper.CateGoryMapper;
import com.hdw.menu.service.CateGoryService;

@Service
public class CateGoryServiceImpl implements CateGoryService {

	@Autowired
	private CateGoryMapper mapper;

	@Override
	public List<CateGoryEntity> listAll() {
		return mapper.selectAll();
	}

}
