package com.hdw.entites;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Table(name="T_MINI_GOOD")
public class GoodEntity {
	
	/**
	 * 主键
	 */
	@Id
	@Column(name = "goodid")
	private Integer goodid;
	
	/**
	 * 商品名称
	 */
	@Column(name="goodName")
	private String goodName;
	
	/**
	 * 商品分类
	 */
	@Column(name="categoryCode")
	private String categoryCode;
	
	/**
	 * 商品价格
	 */
	@Column(name="price")
	private float price;
	
	/**
	 * 图片地址
	 */
	@Column(name="imgSrc")
	private String imgSrc;
	
	/**
	 * 商品描述
	 */
	@Column(name="content")
	private String content;

	/**
	 * 首页模块
	 */
	@Transient
	private String menuCode;

	/**
	 * 首页模块去
	 */
	@Transient
	private String menuName;
	
	/**
	 * 商品详请图片
	 */
	@Column(name="goodsDetailImg")
	private String goodsDetailImg;

	@Transient
	private Integer totalNum;
}
