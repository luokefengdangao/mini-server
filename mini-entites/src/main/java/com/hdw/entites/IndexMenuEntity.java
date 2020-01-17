package com.hdw.entites;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
* @类型名称：IndexMenuEntity
* @类型描述：
* @功能描述：首页菜单
* @创建作者：hdw
 */
@Data
@Table(name="T_MINI_INDEX_MENU")
public class IndexMenuEntity {
	
	private Integer id;
	
	/**
	 * 分类编码
	 */
	@Column(name = "menuCode")
	private String menuCode;
	
	/**
	 * 分类名字
	 */
	@Column(name = "menuName")
	private String menuName;


}
