package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	
	@Column(name = "product_name")
	String productName;
	
	@Column(name = "product_img")
	String productImg;
	
	@Column(name = "category_id")
	int categoryId;
	
	@Column
	int price;
	
	@Column()
	int stock;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, String productImg, int categoryId, int price, int stock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImg = productImg;
		this.categoryId = categoryId;
		this.price = price;
		this.stock = stock;
	}

	public Product(String productName, String productImg, int categoryId, int price, int stock) {
		super();
		this.productName = productName;
		this.productImg = productImg;
		this.categoryId = categoryId;
		this.price = price;
		this.stock = stock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
