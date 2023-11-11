package com.tuto.ms.crud.products.mscrudproducts.controllers;

import com.tuto.ms.crud.products.mscrudproducts.models.Review;
import com.tuto.ms.crud.products.mscrudproducts.services.ReviewService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/product/{productId}")
    public Flux<Review> getReviewsByProductId(@PathVariable Long productId) {
        return reviewService.getReviewsByProductId(productId);
    }

    @CrossOrigin(origins = "http://example.com")
    @GetMapping("/{id}")
    public Mono<Review> getReviewsById(@PathVariable Long id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping
    public Mono<Review> createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @PutMapping
    public Mono<Review> updateReview(@RequestBody Review review) {
        return reviewService.updateReview(review);
    }

    @DeleteMapping({"/{id}"})
    public Mono<Void> deleteReview(@PathVariable Long id) {
        return reviewService.deleteReview(id);
    }

}
