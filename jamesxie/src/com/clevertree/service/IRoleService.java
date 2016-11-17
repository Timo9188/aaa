package com.clevertree.service;

import com.clevertree.entity.Role;

public interface IRoleService {
	public Role queryRole(Integer id);
	public void insert(Role Role);
}
