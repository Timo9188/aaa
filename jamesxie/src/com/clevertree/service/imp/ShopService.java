package com.clevertree.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.clevertree.dao.IShopDao;
import com.clevertree.entity.Shop;
import com.clevertree.service.IShopService;
@Service("ShopService")
@Transactional
public class ShopService implements IShopService {
	@Autowired
    private IShopDao ShopDao;

	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Shop queryShop(Integer id) {

		return ShopDao.queryShop(id);
	}

	@Override
	public void saveShop(Shop shop) {
		ShopDao.saveShop(shop);
		
	}

	@Override
	public void deleteShop(Integer id) {
		ShopDao.deleteShop(id);		
	}

	@Override
	public void updateShop(Shop shop) {
		ShopDao.updateShop(shop);
	}


}
