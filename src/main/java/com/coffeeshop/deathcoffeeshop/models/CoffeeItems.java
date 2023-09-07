package com.coffeeshop.deathcoffeeshop.models;

import jakarta.persistence.*;
    @Entity
    @Table("coffee_items")
public class CoffeeItems {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;

    }

