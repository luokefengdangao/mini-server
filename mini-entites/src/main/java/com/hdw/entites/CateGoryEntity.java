package com.hdw.entites;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "T_MINI_CATEGORY")
public class CateGoryEntity {

	private Integer id;

	/**
	 * 分类编码
	 */
	@Column(name = "CATEGORYCODE")
	private String cateGoryCode;

	/**
	 * 分类名称
	 */
	@Column(name = "CATEGORYNAME")
	private String cateGoryName;

	/**
	 * 图片路径
	 */
	@Column(name = "IMGSRC")
	private String imgSrc;

}
