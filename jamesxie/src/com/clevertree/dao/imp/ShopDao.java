package com.clevertree.dao.imp;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clevertree.dao.IShopDao;
import com.clevertree.entity.Shop;
@Repository("ShopDao")
public class ShopDao implements IShopDao{
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public void saveShop(Shop Shop) {
		sessionTemplate.insert("com.clevertree.dao.IShopDao.saveShop", Shop);
		
	}

	@Override
	public void deleteShop(Integer id) {
		sessionTemplate.delete("com.clevertree.dao.IShopDao.deleteShop", id);
		
	}

	@Override
	public void updateShop(Shop Shop) {
		sessionTemplate.update("com.clevertree.dao.IShopDao.updateShop", Shop);
		
	}

	@Override
	public Shop queryShop(Integer id) {
		return (Shop)sessionTemplate.selectOne("com.clevertree.dao.IShopDao.queryShop", id);
	}

}
