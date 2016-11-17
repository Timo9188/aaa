package com.clevertree.dao.imp;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clevertree.dao.IStaffDao;
import com.clevertree.entity.Staff;
@Repository("StaffDao")
public class StaffDao implements IStaffDao{
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public void saveStaff(Staff sta) {
		sessionTemplate.insert("com.clevertree.dao.IStaffDao.saveStaff", sta);
		
	}

	@Override
	public void deleteStaff(Integer id) {
		sessionTemplate.delete("com.clevertree.dao.IStaffDao.deleteStaff", id);
		
	}

	@Override
	public void updateStaff(Staff sta) {
		sessionTemplate.update("com.clevertree.dao.IStaffDao.updateStaff", sta);
		
	}

	@Override
	public Staff queryStaff(Integer id) {
		return (Staff)sessionTemplate.selectOne("com.clevertree.dao.IStaffDao.queryStaff", id);
	}

}
