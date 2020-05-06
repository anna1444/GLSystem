package com.ua.getgit.controllers;


import com.ua.getgit.entities.Level;
import com.ua.getgit.entities.Progress;
import com.ua.getgit.service.ProgressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ProgressController {

    @Autowired
    ProgressServiceImpl progressService;

    @GetMapping("/progress")
    public String progress(Map<String, Object> model) throws Exception {
        List<Progress> progresses =progressService.getProgress();
        int totalCoins=5;
        model.put("progresses", progresses);
        model.put("coins", totalCoins);
        return "progress";
    }
    @GetMapping("/progressFail")
    public String progressFail(Map<String, Object> model) throws Exception {
        List<Progress> progresses =progressService.getProgress();
        List<Progress> progressFail = new ArrayList<>();
        int totalCoins=0;
        model.put("progresses", progressFail);
        model.put("coins", totalCoins);
        return "progress";
    }
}
