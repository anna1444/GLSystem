package com.ua.getgit.controllers;


import com.sun.org.apache.xpath.internal.operations.Mod;
import com.ua.getgit.entities.User;
import com.ua.getgit.exceptions.UserErrors;
import com.ua.getgit.exceptions.UserException;
import com.ua.getgit.model.CurrentUser;
import com.ua.getgit.repository.UserRepository;
import com.ua.getgit.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mov = new ModelAndView("login");
        return mov;
    }

    @GetMapping("/validate")
    public ModelAndView validate(@RequestParam String username, @RequestParam String password, ModelMap model, HttpServletResponse response) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setCurrentCoins(5);
        Cookie cookie = new Cookie("username", user.getUsername());
        response.addCookie(cookie);

         try {
             if(userService.validate(user)){
                 model.addAttribute("username", username);
                 System.out.println(user.toString());
                 return new ModelAndView("redirect:/levels", model);
             }

         } catch (UserException e) {
             System.out.println(e.getMessage());
             model.addAttribute("errorMessage", UserErrors.INVALID_LOGIN);
         }

         return new ModelAndView("login");

  }

}
