package com.tuto.ms.crud.products.mscrudproducts.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table(name = "product")
@Data
public class Product {

    @Id
    private Long id;
    private String name;
    private double price;
    private String description;

    @MappedCollection(idColumn = "product_id")
    private List<Review> reviews;

}
