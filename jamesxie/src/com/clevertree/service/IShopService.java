package com.clevertree.service;

import com.clevertree.entity.Shop;

public interface IShopService {
	public Shop queryShop(Integer id);
	public void saveShop(Shop shop);
	public void deleteShop(Integer id);
	public void updateShop(Shop shop);
}
