package com.masse.valentin.ecommerce.repositories;

import com.masse.valentin.ecommerce.models.OrderLine;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderLineRepository extends MongoRepository<OrderLine, String> {
}
