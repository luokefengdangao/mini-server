package com.hdw.entites;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "T_MINI_CARD")
@Data
public class CardEntity {

	@Id
	@GeneratedValue(generator = "JDBC")

	private Integer id;

	@Column(name = "goodid")
	private Integer goodId;

	@Column(name = "userid")
	private String userid;

	@Column(name = "totalnum")
	private int totalNum;

}
