package com.nanri.test.product.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.maven.wagon.events.SessionListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nanri.test.product.bo.intf.ProductBO;
import com.nanri.test.product.po.Product;
import com.nanri.utils.config.SysConfig;
import com.nanri.utils.exception.DAOException;
import com.nanri.utils.exception.UtilException;

@Controller
public class ProductController {
	private static Logger log = Logger.getLogger(ProductController.class);  
	  
	@Resource(name="productBO")
	public ProductBO productBO;
    @RequestMapping("/addproduct")
    public @ResponseBody String addProduct() throws Exception {
    	log.info("addProduct():");    	
    	Product product = new Product();
    	product.setProductName("p1");
    	product.setPrice(100);
    	productBO.addProduct(product);
    
        return "add product successfull!";
    }
    @RequestMapping("/errorException")
    public String errorTest() throws Exception {
    	log.info("Exception():");    	
    	throw new Exception("Exception");
    }
    @RequestMapping("/errorDAO")
    public String errorDAO() throws DAOException {
    	log.info("errorDAO():");    	
    	throw new DAOException();
    }
}
