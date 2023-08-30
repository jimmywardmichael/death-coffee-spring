package com.coffeeshop.deathcoffeeshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoffeeClubController {
      @GetMapping("/signup")
    public String coffeeClub(){
        return "html/signup";
    }
}
