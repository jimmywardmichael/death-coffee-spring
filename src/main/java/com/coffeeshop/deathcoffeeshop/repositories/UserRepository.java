package com.coffeeshop.deathcoffeeshop.repositories;

import com.coffeeshop.deathcoffeeshop.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
