package com.tuto.ms.crud.products.mscrudproducts.repositories;

import com.tuto.ms.crud.products.mscrudproducts.models.Review;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReviewRepository extends ReactiveCrudRepository<Review, Long> {
}
