package com.hdw.good.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdw.entites.CardEntity;
import com.hdw.entites.GoodEntity;
import com.hdw.good.mapper.CardMapper;
import com.hdw.good.service.CardService;
import com.hdw.json.JsonUtil;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardMapper mapper;

	@Override
	public boolean insert(String card) {
		CardEntity cardEntity = JsonUtil.json2Object(card, CardEntity.class);

		return mapper.insert(cardEntity) > 0;
	}

	@Override
	public List<GoodEntity> getCardGood(String userId) {
		return mapper.selectCardGood(userId);
	}

}
