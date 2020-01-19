package com.hdw.menu.service;

import java.util.List;

import com.hdw.entites.AddrEntity;

public interface AddrService {

	/**
	 * 
	 * getAddr:根据用户id查询地址
	 * 
	 * @param userId
	 * @return List<AddrEntity>
	 */
	List<AddrEntity> getAddr(String userId);

}
