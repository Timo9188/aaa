package com.clevertree.entity;

import java.util.List;

import org.apache.ibatis.type.Alias;


/**
 * 店面实体类
 * @author swl
 *
 */
@Alias("Shop")
public class Shop {
	private Integer id;
	private String name;//商店名
	private String position;//位置
	private String telphone;//电话
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	
}
