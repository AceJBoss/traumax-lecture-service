package com.savvybytes.traumaxlectures.controllers;

import com.savvybytes.traumaxlectures.models.Lecture;
import com.savvybytes.traumaxlectures.services.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class LectureController {
    @Autowired
    private LectureService lectureService;


    @PostMapping("add-lecture")
    public Lecture addLecture(@RequestBody Lecture lecture){
        return lectureService.createLecture(lecture);
    }
    @GetMapping("fetch-all-lectures")
    public List<Lecture> getLectures(){
        return lectureService.fetchLectures();
    }
    @GetMapping("fetch-a-lecture/{id}")
    public Lecture getLecture(@PathVariable("id") int id){
        return lectureService.fetchLecture(id);
    }
}
