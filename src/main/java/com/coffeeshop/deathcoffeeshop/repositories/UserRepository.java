package com.coffeeshop.deathcoffeeshop.repositories;

import com.coffeeshop.deathcoffeeshop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
