package com.ua.getgit.repository;

import com.ua.getgit.entities.Lecture;
import org.springframework.data.repository.CrudRepository;

public interface LectureRepository extends CrudRepository<Lecture, Integer> {
}
