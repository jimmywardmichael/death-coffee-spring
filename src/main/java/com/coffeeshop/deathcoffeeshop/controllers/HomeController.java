package com.coffeeshop.deathcoffeeshop.controllers;

import com.coffeeshop.deathcoffeeshop.models.CoffeeItems;
import com.coffeeshop.deathcoffeeshop.repositories.CoffeeItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


     private final CoffeeItemRepository coffeeItemsRepository;

    public HomeController(CoffeeItemRepository coffeeItemsRepository) {
        this.coffeeItemsRepository = coffeeItemsRepository;
    }

    @GetMapping("/coffeehome")
    public String getCoffeeItems(Model model) {
        List<CoffeeItems> coffeeItemsList = coffeeItemsRepository.findAll();
        model.addAttribute("coffeeItemsList", coffeeItemsList);
        return "html/coffeehome";
    }
      @GetMapping("/home")
    public String getGreeting(){
        return "html/coffeehome";
    }
}
