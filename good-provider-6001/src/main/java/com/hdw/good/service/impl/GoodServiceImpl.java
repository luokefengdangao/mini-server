package com.hdw.good.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.hdw.entites.GoodEntity;
import com.hdw.entites.IndexMenuGoodEntity;
import com.hdw.good.mapper.GoodMapper;
import com.hdw.good.service.GoodService;

@Service
public class GoodServiceImpl implements GoodService{

	@Autowired
	private GoodMapper mapper;
	
	@Override
	public List<IndexMenuGoodEntity> listIndexMenuGood() {

		List<GoodEntity> goodEntities = mapper.selectIndexMenuGood();
		if (CollectionUtils.isEmpty(goodEntities)) {
			return new ArrayList<>();
		}
		List<IndexMenuGoodEntity> result = new ArrayList<>();
		Map<String, List<GoodEntity>> goodMap = goodEntities.stream()
				.collect(Collectors.groupingBy(GoodEntity::getMenuName));
		for (Entry<String, List<GoodEntity>> good : goodMap.entrySet()) {
			IndexMenuGoodEntity indexMenuGoodEntity = new IndexMenuGoodEntity();
			indexMenuGoodEntity.setMenuName(good.getKey());
			indexMenuGoodEntity.setGoods(good.getValue());
			result.add(indexMenuGoodEntity);
		}
		return result;
	}

	@Override
	public List<GoodEntity> listGood(GoodEntity goodEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GoodEntity getGoodById(Integer goodId) {
		GoodEntity paramEntity = new GoodEntity();
		paramEntity.setGoodid(goodId);
		GoodEntity goodEntity = mapper.selectByPrimaryKey(paramEntity);
		return goodEntity;
	}
	
}
