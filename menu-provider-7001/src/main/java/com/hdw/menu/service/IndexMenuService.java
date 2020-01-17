package com.hdw.menu.service;

import java.util.List;

import com.hdw.entites.IndexMenuEntity;

public interface IndexMenuService {
	
	/**
	 * 
	 * 
	 * listAll:查询首页所有的菜单
	 * 
	 * @return List<IndexMenuEntity>
	 */
	public List<IndexMenuEntity> listAll();

}
