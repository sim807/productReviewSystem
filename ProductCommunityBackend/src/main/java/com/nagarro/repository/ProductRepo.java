package com.nagarro.repository;

import java.util.List;

import com.nagarro.models.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepo extends JpaRepository<Product, Long> {

	@Query("select p from Product p where p.productName LIKE %?1%" + "OR p.brand LIKE %?1%"
			+ "OR p.productCode LIKE %?1%")
	public List<Product> findByKeyword(String keyword);

	public Product findByProductCode(String productCode);
}
