package com.clevertree.dao.imp;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clevertree.dao.IPMemberDao;
import com.clevertree.entity.PMember;
@Repository("PMemberDao")
public class PMemberDao implements IPMemberDao{
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public void savePMem(PMember pm) {
		sessionTemplate.insert("com.clevertree.dao.IPMemberDao.savePMem", pm);
		
	}

	@Override
	public void deletePMem(Integer id) {
		sessionTemplate.delete("com.clevertree.dao.IPMemberDao.deletePMem", id);
		
	}

	@Override
	public PMember queryPMem(Integer id) {
		return (PMember)sessionTemplate.selectOne("com.clevertree.dao.IPMemberDao.queryPMem", id);
	}

}
