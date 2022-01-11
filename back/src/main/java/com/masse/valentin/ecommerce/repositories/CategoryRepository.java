package com.masse.valentin.ecommerce.repositories;

import com.masse.valentin.ecommerce.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
