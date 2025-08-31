package com.example.demo;

public class ProductResDTO {
	int productId;
	String productName;
	String productImg;
	int categoryId;
	String categoryName;
	int price;
	int stock;
	
	public ProductResDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductResDTO(int productId, String productName, String productImg, int categoryId, String categoryName,
			int price, int stock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImg = productImg;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.price = price;
		this.stock = stock;
	}

	public ProductResDTO(String productName, String productImg, int categoryId, String categoryName, int price,
			int stock) {
		super();
		this.productName = productName;
		this.productImg = productImg;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	@Override
	public String toString() {
		return "ProductResDTO [productId=" + productId + ", productName=" + productName + ", productImg=" + productImg
				+ ", categoryId=" + categoryId + ", categoryName=" + categoryName + ", price=" + price + ", stock="
				+ stock + "]";
	}
}
