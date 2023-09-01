package com.coffeeshop.deathcoffeeshop.controllers;

import com.coffeeshop.deathcoffeeshop.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CoffeeClubController {

      @GetMapping("/signup")
    public String coffeeClub(Model theModel){
          theModel.addAttribute("user", new User());
        return "html/signup";
    }
    @PostMapping("/signup")
    public String signupForm(@ModelAttribute("user") User user,
                             BindingResult theBindingResult) {
         if (theBindingResult.hasErrors()) {
             return "signup";
         }
         else {
             return "html/coffeehome";
         }
    }
//    Save the new user

}
