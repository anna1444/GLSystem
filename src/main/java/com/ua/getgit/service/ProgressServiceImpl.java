package com.ua.getgit.service;

import com.ua.getgit.entities.Progress;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgressServiceImpl {

    public List<Progress> getProgress(){
        List<Progress> progressList = new ArrayList<>();
        progressList.add(new Progress(1, "Benefits of version control", 5));

        return progressList;
    }

}
