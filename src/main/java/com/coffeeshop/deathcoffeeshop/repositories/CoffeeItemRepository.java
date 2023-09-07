package com.coffeeshop.deathcoffeeshop.repositories;


import com.coffeeshop.deathcoffeeshop.models.CoffeeItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeItemRepository extends JpaRepository<CoffeeItems, Long> {

}
