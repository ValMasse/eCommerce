package com.masse.valentin.ecommerce.repositories;

import com.masse.valentin.ecommerce.models.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {
}
