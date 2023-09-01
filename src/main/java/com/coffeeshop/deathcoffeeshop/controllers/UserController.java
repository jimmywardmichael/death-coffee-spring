package com.coffeeshop.deathcoffeeshop.controllers;

import com.coffeeshop.deathcoffeeshop.models.User;
import com.coffeeshop.deathcoffeeshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
//Dependency injection
    private final UserRepository userDao;
    @Autowired
public UserController(UserRepository userDao){
        this.userDao = userDao;
    }
    @GetMapping("/signup")
public String showSignUpForm(Model model) {
    User user = new User(); // Create a new User object
    model.addAttribute("user", user); // Add the 'user' object to the model
    return "html/signup";
}
    @PostMapping ("/signup")
    public String coffeeClub(Model theModel) {
        // Create a new User instance to save
        User newUser = new User();
             // Set values for required fields
        newUser.setUsername("exampleUsername");
        newUser.setFname("John");
        newUser.setLname("Doe");
        newUser.setEmail("john@example.com");
        newUser.setPassword("password"); // You should handle password hashing in a secure way
        newUser.setConfpassword("password"); // You should handle password hashing in a secure way
        newUser.setAddress("123 Main St");
        newUser.setAddress2("Apt 456");
        newUser.setCity("City");
        newUser.setState("State");
        newUser.setZip("12345");

        // Save the new user to the database
        userDao.save(newUser);

        return "redirect:html/coffeehome";
    }
}
