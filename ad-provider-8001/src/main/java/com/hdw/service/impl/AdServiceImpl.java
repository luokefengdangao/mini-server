package com.hdw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdw.entites.AdEntity;
import com.hdw.mapper.AdMapper;
import com.hdw.service.AdService;

@Service
public class AdServiceImpl implements AdService {
	
	@Autowired
	private AdMapper admapper;

	@Override
	public List<AdEntity> list() {
		return admapper.selectAll();
	}

	@Override
	public boolean add(AdEntity adEntity) {
		return admapper.insert(adEntity) > 0;
	}

}
