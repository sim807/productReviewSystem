package com.nagarro.services;

import java.util.List;

import javax.validation.Valid;

//import javax.validation.Valid;

import com.nagarro.models.Product;
//import com.nagarro.models.Status;
import com.nagarro.models.Status;

public interface ProductService {
	
	public List<Product> fetchProductByProductNameOrBrandOrProductCode(String query);

	public Product saveProduct(Product product);

	public Product showSingleProduct(Long productId);

	public Product findByProductCode(String productCode);

	public List<Product> findAll();

	public Status addProduct(@Valid Product product);
}
