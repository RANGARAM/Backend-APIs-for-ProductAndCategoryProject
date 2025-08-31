package com.example.demo;

import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	ProductRepo repo;
	
	CategoryRepo repo1;
	
	
	
	
	public ProductService(ProductRepo repo, CategoryRepo repo1) {
		super();
		this.repo = repo;
		this.repo1 = repo1;
	}




	public Product addProduct(Product product) {
		Product pro = repo.save(product);
		return pro;
	}
	
	public boolean delProduct(int id) {
		Product product = repo.findById(id).orElse(null);
		if(product != null) {
			repo.delete(product);
			return true;
		}
		return false;
	}
	
	public List<Product> getAllProducts(int id){
		List<Product> products = repo.findByCategoryId(id);
		return products;
	}
	
	public ProductResDTO getProductAndName(int id) {
		Product product = repo.findById(id).orElse(null);
		
		String categoryName = repo1.findById(product.categoryId)
				.map(Category::getCategoryName).orElse(null);
		
		int productId = product.getProductId();
		String productName = product.getProductName();
		String productImg = product.getProductImg();
		int categoryId = product.getCategoryId();
		int price = product.getPrice();
		int stock = product.getStock();
		
		
		
		ProductResDTO productResDto = new ProductResDTO(productId, productName, productImg, categoryId, categoryName, price, stock);
		return productResDto;
	}
	
}
