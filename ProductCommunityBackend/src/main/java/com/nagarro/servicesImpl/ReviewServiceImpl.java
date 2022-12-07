package com.nagarro.servicesImpl;

import java.util.List;

import com.nagarro.models.Review;
import com.nagarro.repository.ReviewRepo;
import com.nagarro.services.ReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewRepo reviewRepository;

	public Review addReview(Review review) {
		return this.reviewRepository.save(review);
	}

	public List<Review> findByProductId(Long productId) {
		return this.reviewRepository.findByProductId(productId);
	}

	/**
	 * @param ProductId
	 */
	public List<Review> showProductReview(Long productId) {
		return this.reviewRepository.findAllById(productId);
	}

	public List<Review> findAll() {
		return this.reviewRepository.findAll();
	}

	/**
	 *
	 */
	public List<Review> findAllReviews() {
		return this.reviewRepository.findAllReviews();
	}

	public void save(Review review) {
		this.reviewRepository.save(review);
	}

}
