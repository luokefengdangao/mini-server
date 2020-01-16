package com.hdw.entites;


import javax.persistence.Column;
import javax.persistence.Table;


import lombok.Data;

/**
 * 
* @类型名称：AdEntity
* @类型描述：
* @功能描述：
* @创建作者：hdw
 */
@Data
@Table(name="T_MINI_AD")
public class AdEntity {
	
	/**
	 * 主键
	 */
	@Column(name="adId")
	private Integer adId;
	
	/**
	 * 名字
	 */
	@Column(name="adName")
	private String adName;
	
	/**
	 * 图片地址
	 */
	@Column(name="imgSrc")
	private String imgSrc;
	
	/**
	 * 广告描述
	 */
	@Column(name="adContent")
	private String adContent;
	
	/**
	 * 点击跳转路由
	 */
	@Column(name="route")
	private String route;

}
