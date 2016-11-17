package com.clevertree.dao;

import com.clevertree.entity.Shop;

public interface IShopDao {
	
	public void saveShop(Shop shop);
	
	public void deleteShop(Integer id);
	
	public void updateShop(Shop shop);
	
	public Shop queryShop(Integer id);
}
