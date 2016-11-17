package com.clevertree.service;

import com.clevertree.entity.Member;

public interface IMemberService {
	public Member queryMem(Integer id);
	public void saveMem(Member mem);
	public void deleteMem(Integer id);
	public void updateMem(Member mem);
}
