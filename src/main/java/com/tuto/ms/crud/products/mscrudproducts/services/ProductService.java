package com.tuto.ms.crud.products.mscrudproducts.services;

import com.tuto.ms.crud.products.mscrudproducts.models.Product;
import com.tuto.ms.crud.products.mscrudproducts.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Mono<Product> createProduct(Product product) {
        return productRepository.save(product);
    }

    public Flux<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Mono<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }

    @Transactional
    public Mono<Product> updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Transactional
    public Mono<Void> deleteProduct(Long productId) {
        return productRepository.deleteById(productId);
    }
}
