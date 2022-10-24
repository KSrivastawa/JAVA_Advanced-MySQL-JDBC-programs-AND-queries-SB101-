package com.Q5_SortBy_Price_Descending_lambda;

import java.util.Objects;

public class Product {

	private int productId;
	private String productName;
	private int quantity;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String productName, int quantity, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(productName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productName, other.productName);
	}
	
	
	
}
