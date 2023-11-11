package com.tuto.ms.crud.products.mscrudproducts.repositories;

import com.tuto.ms.crud.products.mscrudproducts.models.Review;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ReviewRepository extends ReactiveCrudRepository<Review, Long> {
    @Query("SELECT * FROM review WHERE product_id = :#{[0]}")
    Flux<Review> getReviewsByProductId(Long productId);
}
