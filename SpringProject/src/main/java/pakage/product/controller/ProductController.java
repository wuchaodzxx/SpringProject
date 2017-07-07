package pakage.product.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pakage.product.bo.intf.ProductBO;
import pakage.product.po.Product;

@Controller
public class ProductController {
	@Resource(name="productBO")
	public ProductBO productBO;
    @RequestMapping("/addproduct")
    public @ResponseBody String addProduct() {
    	Product product = new Product();
    	product.setProductName("p1");
    	product.setPrice(100);
    	productBO.addProduct(product);
        return "add product successfull!";
    }
}
