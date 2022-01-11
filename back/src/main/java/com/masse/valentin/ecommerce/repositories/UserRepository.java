package com.masse.valentin.ecommerce.repositories;

import com.masse.valentin.ecommerce.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
