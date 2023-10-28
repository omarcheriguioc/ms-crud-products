package com.tuto.ms.crud.products.mscrudproducts.repositories;

import com.tuto.ms.crud.products.mscrudproducts.models.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {
}
