package com.hdw.service;

import java.util.List;

import com.hdw.entites.AdEntity;

/**
 * 
* @类型名称：AdService
* @类型描述：广告服务
* @功能描述：广告服务
* @创建作者：hdw
 */
public interface AdService {
	
	/**
	 * 
	 * list:查询广告服务
	 * 
	 * @param ad
	 * @return List<AdEntity>
	 */
	List<AdEntity> list();
	
	
	/**
	 * 
	 * add:添加广告
	 * 
	 * @param adEntity
	 * @return boolean
	 */
	boolean add(AdEntity adEntity);

}
