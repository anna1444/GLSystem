package com.ua.getgit.controllers;


import com.ua.getgit.entities.Lecture;
import com.ua.getgit.entities.Rating;
import com.ua.getgit.service.LectureService;
import com.ua.getgit.service.impl.LectureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class LectureController {

    @Autowired
    LectureService lectureService;

    @GetMapping("/lectures")
    public String rating(Map<String, Object> model) {
        List<Lecture> listLectures = lectureService.getAllLectures();
        model.put("lectures", listLectures);
        return "lectures";
    }
    @GetMapping("/openLecture")
    public ModelAndView openLecture() {
        ModelAndView mov = new ModelAndView("/lecturesSet/lecture_1");
        return mov;
    }

    @GetMapping("/openTask")
    public ModelAndView openTask() {
        ModelAndView mov = new ModelAndView("/missions/1_task");
        return mov;
    }
    }
