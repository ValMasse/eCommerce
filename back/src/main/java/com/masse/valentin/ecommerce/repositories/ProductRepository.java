package com.masse.valentin.ecommerce.repositories;

import com.masse.valentin.ecommerce.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
