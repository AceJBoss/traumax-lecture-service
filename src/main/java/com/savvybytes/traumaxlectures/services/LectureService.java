package com.savvybytes.traumaxlectures.services;

import com.savvybytes.traumaxlectures.models.Lecture;
import com.savvybytes.traumaxlectures.repositories.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {
    @Autowired
    private LectureRepository lectureRepository;

    public Lecture createLecture(Lecture lecture){
        return lectureRepository.save(lecture);
    }
    public List<Lecture> fetchLectures(){
        return lectureRepository.findAll();
    }
    public Lecture fetchLecture(int id){
        return lectureRepository.findById(id).orElse(null);
    }
}
