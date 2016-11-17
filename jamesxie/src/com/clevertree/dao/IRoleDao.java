package com.clevertree.dao;

import java.util.Map;

import com.clevertree.entity.Role;

public interface IRoleDao {
	public Role queryRole(Integer id);
	public Role queryRole(Map<String,Object> map);
	public void save(Role Role);
	public void insertRole(Role Role);
}	
