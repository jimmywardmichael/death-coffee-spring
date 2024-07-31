package com.coffeeshop.deathcoffeeshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.coffeeshop.deathcoffeeshop.models.Coffee;
import com.coffeeshop.deathcoffeeshop.service.CoffeeService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("/home")
    public String getGreeting(Model model) {
        List<Coffee> coffees = coffeeService.getAllCoffees(); // Fetch coffee list from service
        model.addAttribute("coffees", coffees); // Add coffees to model
        return "html/coffeehome"; // Template file should be located at src/main/resources/templates/coffeehome.html
    }
}
