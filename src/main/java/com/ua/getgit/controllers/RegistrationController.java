package com.ua.getgit.controllers;

import com.ua.getgit.entities.User;
import com.ua.getgit.exceptions.UserException;
import com.ua.getgit.repository.UserRepository;
import com.ua.getgit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @Autowired
    UserRepository userRepo;

    @Autowired
    UserService userService;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping("/createUser")
    public String saveUser(@RequestParam String username, @RequestParam String password, Model model){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        try {
            userService.saveUser(user);
        }
        catch (UserException e) {
            System.out.println(e.getMessage());
            model.addAttribute("errorMessage", e.getMessage());
            return "registration";
        }
        return "login";
    }




}
