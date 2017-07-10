package com.nanri.test.product.bo.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nanri.test.product.bo.intf.ProductBO;
import com.nanri.test.product.dao.intf.ProductDAO;
import com.nanri.test.product.po.Product;

@Repository("productBO")
public class ProductBOImpl implements ProductBO{

	@Resource(name="productDAO")
	public ProductDAO productDAO;
	
	@Transactional
	public void addProduct(Product product) {
		System.out.println("ProductBOImpl addProduct!");
		productDAO.addProduct(product);
	}

}
