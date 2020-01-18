package com.hdw.good.service;

import java.util.List;

import com.hdw.entites.GoodEntity;
import com.hdw.entites.IndexMenuGoodEntity;

/**
 * 
* @类型名称：GoodService
* @类型描述: 商品服务
* @功能描述：
* @创建作者：hdw
 */
public interface GoodService {
	
	/**
	 * 
	 * listIndexMenuGood:查询首页首页商品Id
	 * 
	 * @param goodIds
	 * @return List<IndexMenuGoodEntity>
	 */
	List<IndexMenuGoodEntity> listIndexMenuGood();
	
	/**
	 * 
	 * getGoodById:根据主键查询商品信息
	 * 
	 * @param goodId
	 * @return GoodEntity
	 */
	GoodEntity getGoodById(Integer goodId);

	/**
	 * 
	 * listGood: 查询商品
	 * 
	 * @param goodEntity
	 * @return List<GoodEntity>
	 */
	List<GoodEntity> listGood(GoodEntity goodEntity);

}
