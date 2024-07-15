package com.coffeeshop.deathcoffeeshop.controllers;

import com.coffeeshop.deathcoffeeshop.models.User;
import com.coffeeshop.deathcoffeeshop.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    // Dependency injection
    private final UserRepository userDao;

    @Autowired
    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        // Create a new User object
        model.addAttribute("user", new User()); // Add the 'user' object to the model
        return "html/signup";
    }

    @PostMapping("/signup")
    public String processSignUpForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "html/signup";
        }

        userDao.save(user); // This uses your UserRepository to save to MongoDB

        return "html/coffeehome";
    }
}

