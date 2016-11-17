package com.clevertree.dao.imp;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clevertree.dao.IMemberDao;
import com.clevertree.entity.Member;
@Repository("MemberDao")
public class MemberDao implements IMemberDao{
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public void saveMem(Member mem) {
		sessionTemplate.insert("com.clevertree.dao.IMemberDao.saveMem", mem);
		
	}

	@Override
	public void deleteMem(Integer id) {
		sessionTemplate.delete("com.clevertree.dao.IMemberDao.deleteMem", id);
		
	}

	@Override
	public void updateMem(Member mem) {
		sessionTemplate.update("com.clevertree.dao.IMemberDao.updateMem", mem);
		
	}

	@Override
	public Member queryMem(Integer id) {
		return (Member)sessionTemplate.selectOne("com.clevertree.dao.IMemberDao.queryMem", id);
	}

}
