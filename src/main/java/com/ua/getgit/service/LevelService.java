package com.ua.getgit.service;

import com.ua.getgit.entities.Level;

import java.util.List;

public interface LevelService {
    List<Level> getAllLevels() throws Exception;

    void openLevel(int userId, int levelId, boolean bool);

}
