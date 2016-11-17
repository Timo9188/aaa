package com.clevertree.conctroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clevertree.entity.Member;
import com.clevertree.service.IMemberService;

@Controller
@RequestMapping("/back")
public class TestController {
	@Autowired
	private IMemberService MemberService;
	
	@RequestMapping("/test")
	public String queryMember(Integer id){
		
		System.out.println(MemberService.queryMem(id));
		return "index";
	}
	
	@RequestMapping("/test1")
	public String saveMember(Member mem){
		MemberService.saveMem(mem);
		return "index";
	}
	
	@RequestMapping("/test2")
	public String deleteMember(Integer id){
		MemberService.deleteMem(id);
		return "index";
	}
	
	@RequestMapping("/test3")
	public String updateMember(Member mem){
		MemberService.updateMem(mem);
		return "index";
	}
	@RequestMapping("/clevertree")
	public String getIndex(){
		return "index";
	}
}
