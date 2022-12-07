package com.nagarro.repository;

import java.util.List;

import com.nagarro.models.Review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReviewRepo extends JpaRepository<Review,Long>{
	
	@Query(value = "from Review r where r.productId = ?1")
	List<Review> findAllById(Long productId);

	@Query(value = "from Review r where r.approved=0 OR r.approved=null")
	List<Review> findAll();

	@Query(value = "from Review r where r.approved=1")
	List<Review> findAllReviews();

	List<Review> findByProductId(Long productId);

}
