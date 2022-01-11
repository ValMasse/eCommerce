package com.masse.valentin.ecommerce.repositories;

import com.masse.valentin.ecommerce.models.Delivery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryRepository extends MongoRepository<Delivery, String> {
}
