package pakage.product.bo.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pakage.product.bo.intf.ProductBO;
import pakage.product.dao.intf.ProductDAO;
import pakage.product.po.Product;

@Repository("productBO")
@Service
public class ProductBOImpl implements ProductBO{

	@Resource(name="productDAO")
	public ProductDAO productDAO;
	
	@Transactional
	public void addProduct(Product product) {
		System.out.println("ProductBOImpl addProduct!");
		productDAO.addProduct(product);
	}

}
