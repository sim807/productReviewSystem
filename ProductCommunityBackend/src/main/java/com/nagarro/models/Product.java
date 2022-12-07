package com.nagarro.models;

import java.io.Serializable;
import java.util.List;

//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String productName;
	private String brand;
	private double prodPrice;

	private String productCode;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "prod_code_fk", referencedColumnName = "productId")
	private List<Review> prodReviews;

	public Product(Long productId, String productName, String brand, double prodPrice, String productCode,
			List<Review> prodReviews) {
		
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.prodPrice = prodPrice;
		this.productCode = productCode;
		this.prodReviews = prodReviews;
	}

	public Product() {
		
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public Long getProductId() {
		return productId;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public List<Review> getProdReviews() {
		return prodReviews;
	}

	public void setProdReviews(List<Review> prodReviews) {
		this.prodReviews = prodReviews;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
