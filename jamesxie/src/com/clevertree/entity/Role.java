package com.clevertree.entity;

import org.apache.ibatis.type.Alias;


/**
 * 角色权限类
 * @author swl
 *
 */
@Alias("Role")
public class Role {
	
	private Integer id;
	private String name;
	private String desc;
	private String module;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	
	
	
}
