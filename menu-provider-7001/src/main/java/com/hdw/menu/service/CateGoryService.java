package com.hdw.menu.service;

import java.util.List;

import com.hdw.entites.CateGoryEntity;

public interface CateGoryService {

	/**
	 * 
	 * listAll:获取所有的分类
	 * 
	 * @return List<CateGoryEntity>
	 */
	List<CateGoryEntity> listAll();

}
