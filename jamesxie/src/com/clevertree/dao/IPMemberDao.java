package com.clevertree.dao;

import com.clevertree.entity.PMember;

public interface IPMemberDao {
	
	public void savePMem(PMember pm);
	
	public void deletePMem(Integer id);

	public PMember queryPMem(Integer id);
}
