package com.tuto.ms.crud.products.mscrudproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.tuto.ms.crud.products.mscrudproducts.models")
public class MsCrudProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCrudProductsApplication.class, args);
	}

}
