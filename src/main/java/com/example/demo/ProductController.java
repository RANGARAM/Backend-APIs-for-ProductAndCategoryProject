package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	ProductService service;
	
	
	public ProductController(ProductService service) {
		super();
		this.service = service;
	}


	@PostMapping("/add")
	public String addProduct(@RequestBody ProductDTO product) {
		String productName = product.getProductName();
		String productImg = product.getProductImg();
		int categoryId = product.getCategoryId();
		int price = product.getPrice();
		int stock = product.getStock();
		Product pro = new Product(productName, productImg, categoryId, price, stock);
		service.addProduct(pro);
		
		return "product added succesfil,";
	}
	
	@DeleteMapping("/delete")
	public String deleteProduct(@RequestParam("id") int id) {
		boolean isdeleted = service.delProduct(id);
		if(isdeleted) {
			return "product deleted";
		} else {
			return "enter correct id";
		}
	}
	
	@GetMapping("/get")
	public List<Product> getProducts(@RequestParam("id") int id) {
		List<Product> products = service.getAllProducts(id);
		return products;
	}
	
	@GetMapping("/getProductAndCategory/{productId}")
	public ProductResDTO getProductAndCategoryName(@PathVariable int productId) {
		ProductResDTO res = service.getProductAndName(productId);
		return res;
	}
}
