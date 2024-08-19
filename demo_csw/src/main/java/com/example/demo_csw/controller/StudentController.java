package com.example.demo_csw.controller;

import com.example.demo_csw.DTO.ResponseEntity;
import com.example.demo_csw.entity.Student;
import com.example.demo_csw.services.ClassroomService;
import com.example.demo_csw.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity getAllStudents() {
        return studentService.getAllStudents();
    }

//    @GetMapping("/classrooms")
//    public ResponseEntity getAllClassrooms() {
//        return classroomService.getAllClassrooms();
//
//    }
}
