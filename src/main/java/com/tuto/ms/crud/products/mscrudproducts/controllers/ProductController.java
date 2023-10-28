package com.tuto.ms.crud.products.mscrudproducts.controllers;

import com.tuto.ms.crud.products.mscrudproducts.models.Product;
import com.tuto.ms.crud.products.mscrudproducts.services.ProductService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Flux<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Mono<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Mono<Product> createProduct(@RequestBody Product productMono) {
        return productService.createProduct(productMono);
    }

    @PutMapping
    public Mono<Product> updateProduct(@RequestBody Product productMono) {
        return productService.updateProduct(productMono);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteProduct(@PathVariable Long id) {
        return productService.deleteProduct(id);
    }
}
