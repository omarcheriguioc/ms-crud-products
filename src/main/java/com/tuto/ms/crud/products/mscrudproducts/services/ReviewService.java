package com.tuto.ms.crud.products.mscrudproducts.services;

import com.tuto.ms.crud.products.mscrudproducts.models.Review;
import com.tuto.ms.crud.products.mscrudproducts.repositories.ReviewRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Transactional
    public Mono<Review> createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Flux<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Mono<Review> getReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId);
    }

    @Transactional
    public Mono<Review> updateReview(Review review) {
        return reviewRepository.save(review);
    }

    @Transactional
    public Mono<Void> deleteReview(Long reviewId) {
        return reviewRepository.deleteById(reviewId);
    }
}
