package com.hdw.entites;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "T_MINI_ADDR")
public class AddrEntity {

	@Id
	private Integer id;

	@Column(name = "addr")
	private String addr;

	@Column(name = "userId")
	private String userId;

	@Column(name = "isDefault")
	private String isDefault;

	@Column(name = "phone")
	private String phone;

	@Column(name = "name")
	private String name;

}
