package com.hdw.good.service;

import java.util.List;

import com.hdw.entites.GoodEntity;

public interface CardService {

	/**
	 * 
	 * insert:插入购物车信息
	 * 
	 * @param card 购物车信息
	 * @return boolean
	 */
	boolean insert(String card);

	/**
	 * 
	 * getCardGood:获取用户的购物车信息
	 * 
	 * @param userId
	 * @return List<GoodEntity>
	 */
	List<GoodEntity> getCardGood(String userId);

}
