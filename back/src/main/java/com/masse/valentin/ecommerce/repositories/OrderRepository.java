package com.masse.valentin.ecommerce.repositories;

import com.masse.valentin.ecommerce.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
