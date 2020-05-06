package com.ua.getgit.controllers;


import com.ua.getgit.entities.Rating;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class RatingController {

    @GetMapping("/rating")
    public String rating(Map<String, Object> model) {
        List<Rating> listRating = new ArrayList<>();
        Rating r1=new Rating(1, "5556", 5);
        listRating.add(r1);

        model.put("ratings", listRating);
        return "rating";
    }

    @GetMapping("/ratingFail")
    public String ratingFail(Map<String, Object> model) {
        List<Rating> listRating = new ArrayList<>();
        model.put("ratings", listRating);
        return "rating";
    }

}
