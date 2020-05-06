package com.ua.getgit.controllers;


import com.ua.getgit.entities.Level;
import com.ua.getgit.service.LevelService;
import com.ua.getgit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class LevelController {

    @Autowired
    LevelService levelService;

    @Autowired
    UserService userService;

    @GetMapping("/levels")
    public String level(Map<String, Object> model, HttpServletRequest request) throws Exception {

        String username = null;
        Cookie[] cookies = request.getCookies();
        System.out.println("cookies: " + cookies);
        Cookie cookie = null;
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                System.out.println(cookie);
                username=cookie.getValue();
        }
        }
        System.out.println(cookie.getValue());
        List<Level> levels =levelService.getAllLevels();
        System.out.println(username);
      int coins =  userService.getCurrentCoins(username);

        System.out.println(levels.isEmpty());
        model.put("levels", levels);
        model.put("coins", coins);


        return "levels";
    }

    @GetMapping("/buyLevel")
    public String buyLevel(Map<String, Object> model) throws Exception {
        List<Level> levels =levelService.getAllLevels();
        List<Level> levels2=new ArrayList<>();
        for(Level l: levels){
            l.setStatus("OPEN");
            levels2.add(l);

        }
        int coins=0;
        System.out.println(levels.isEmpty());
        model.put("levels", levels2);
        model.put("coins", coins);
        return "levels";
    }

}
