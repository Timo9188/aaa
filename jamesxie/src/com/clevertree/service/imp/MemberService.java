package com.clevertree.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.clevertree.dao.IMemberDao;
import com.clevertree.entity.Member;
import com.clevertree.service.IMemberService;
@Service("MemberService")
@Transactional
public class MemberService implements IMemberService {
	@Autowired
    private IMemberDao memDao;

	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Member queryMem(Integer id) {

		return memDao.queryMem(id);
	}

	@Override
	public void saveMem(Member mem) {
		memDao.saveMem(mem);
		
	}

	@Override
	public void deleteMem(Integer id) {
		memDao.deleteMem(id);		
	}

	@Override
	public void updateMem(Member mem) {
		memDao.updateMem(mem);
	}


}
