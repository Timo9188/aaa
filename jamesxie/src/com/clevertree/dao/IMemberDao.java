package com.clevertree.dao;

import com.clevertree.entity.Member;

public interface IMemberDao {
	
	public void saveMem(Member mem);
	
	public void deleteMem(Integer id);
	
	public void updateMem(Member mem);
	
	public Member queryMem(Integer id);
}
