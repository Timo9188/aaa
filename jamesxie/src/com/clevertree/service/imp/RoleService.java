package com.clevertree.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.clevertree.dao.IRoleDao;
import com.clevertree.entity.Role;
import com.clevertree.service.IRoleService;
@Service("RoleService")
@Transactional
public class RoleService implements IRoleService {
	@Autowired
    private IRoleDao RoleDao;
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Role queryRole(Integer id) {
		// TODO Auto-generated method stub
		return RoleDao.queryRole(id);
	}

	public void insert(Role Role) {
		RoleDao.insertRole(Role);
		
	}


}
