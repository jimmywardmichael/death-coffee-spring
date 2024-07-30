package com.coffeeshop.deathcoffeeshop.service;

import org.springframework.stereotype.Service;
import com.coffeeshop.deathcoffeeshop.models.Coffee;

import java.util.List;
import java.util.ArrayList;

@Service
public class CoffeeService {

    public List<Coffee> getAllCoffees() {

        List<Coffee> coffees = new ArrayList<>();
        // Add some coffee items to the list
        return coffees;
    }
}
