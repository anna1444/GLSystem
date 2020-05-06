package com.ua.getgit.service.impl;

import com.ua.getgit.entities.Level;
import com.ua.getgit.repository.LevelRepository;
import com.ua.getgit.service.LevelService;
import com.ua.getgit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {

    @Autowired
    LevelRepository levelRepository;

    @Override
    public List<Level> getAllLevels() throws Exception {
        List<Level> levelList = (List<Level>) levelRepository.findAll();
        if(levelList.isEmpty()){
            throw new Exception("LevelList is Empty");
        }
        return levelList ;
    }

    @Override
    public void openLevel(int userId, int levelId, boolean bool) {
        if(bool == true) {

        }
    }
}
