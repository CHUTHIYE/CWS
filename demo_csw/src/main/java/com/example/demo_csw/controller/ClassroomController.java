package com.example.demo_csw.controller;

import com.example.demo_csw.DTO.ResponseEntity;
import com.example.demo_csw.services.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClassroomController {
    @Autowired
    private ClassroomService classroomService;
    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping("/classrooms")
    public ResponseEntity getAllClassrooms() {
        return classroomService.getAllClassrooms();

    }

}
