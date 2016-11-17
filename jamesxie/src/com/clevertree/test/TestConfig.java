package com.clevertree.test;
import java.util.Date;

import org.apache.ibatis.session.ExecutorType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.DispatcherServlet;

import com.clevertree.dao.IMemberDao;
import com.clevertree.dao.IPMemberDao;
import com.clevertree.dao.IShopDao;
import com.clevertree.dao.IStaffDao;
import com.clevertree.dao.imp.PMemberDao;
import com.clevertree.dao.imp.ShopDao;
import com.clevertree.entity.Member;
import com.clevertree.entity.PMember;
import com.clevertree.entity.Shop;
import com.clevertree.entity.Staff;
import com.clevertree.service.IMemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestConfig {
	@Autowired
	private IMemberDao MemberDAO;
	@Autowired
	private IShopDao shopDao;
	@Autowired
	private IPMemberDao pMemberDao;
	@Autowired
	private IStaffDao staffDao;
	@Autowired
	private IMemberService MemberService;
	@Test
	public  void testQuery() {
		Member mem = MemberDAO.queryMem(2);
		System.out.println(mem.getAddress());
		
	}
	@Test
	public  void testSave() {
		Member mem=new Member();
		mem.setName("lisi");
		mem.setAddress("海淀");
		mem.setPassword("123456");
		mem.setMemid("10010");
		mem.setRegdate(new Date());
		MemberDAO.saveMem(mem);
		
	}
	@Test
	public  void testQuery2() {
		Shop shop = shopDao.queryShop(1);
		System.out.println(shop.getPosition());
		
	}
	@Test
	public  void testSave2() {
		Shop shop=new Shop();
		shop.setName("龙苑四店");
		shop.setPosition("海淀");
		shopDao.saveShop(shop);
		
	}
	@Test
	public  void testQuery3() {
		Staff sta = staffDao.queryStaff(1);
		System.out.println(sta.getName());
		Shop shop = sta.getShop();
		System.out.println(shop.getPosition());
	}
	@Test
	public  void testSave3() {
		Staff sta=new Staff();
		sta.setName("张三");
		sta.setAddress("海淀");
		sta.setEntrydate(new Date());
		sta.setSid("100001");
		sta.setShop(shopDao.queryShop(1));
		staffDao.saveStaff(sta);
		
	}
	
	@Test
	public  void testQuery4() {
		PMember pm = pMemberDao.queryPMem(1);
		System.out.println(pm.getName());
		System.out.println(pm.getStaff().getName());
	}
	@Test
	public  void testSave4() {
		PMember pm=new PMember();
		pm.setName("王二");
		pm.setAddress("昌平");
		pm.setBirthday(new Date());
		pm.setStaff(staffDao.queryStaff(1));
		pMemberDao.savePMem(pm);
		
	}
}
