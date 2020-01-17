package com.hdw.entites;

import java.util.List;

import lombok.Data;

@Data
public class IndexMenuGoodEntity {

	/**
	 * 菜单
	 */
	private String menuCode;

	/**
	 * 菜单名字
	 */
	private String menuName;

	/**
	 * 商品
	 */
	List<GoodEntity> goods;

}
