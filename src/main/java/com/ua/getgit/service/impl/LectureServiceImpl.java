package com.ua.getgit.service.impl;


import com.ua.getgit.entities.Lecture;
import com.ua.getgit.entities.Progress;
import com.ua.getgit.repository.LectureRepository;
import com.ua.getgit.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LectureServiceImpl implements LectureService {

    @Autowired
    LectureRepository lectureRepository;

    @Override
    public List<Lecture> getAllLectures(){
        return (List<Lecture>) lectureRepository.findAll();
    }


}
