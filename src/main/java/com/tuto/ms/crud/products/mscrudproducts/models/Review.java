package com.tuto.ms.crud.products.mscrudproducts.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "review")
@Data
public class Review {

    @Id
    private Long id;
    private Long product_id;
    private String comment;
    private int rating;
}
