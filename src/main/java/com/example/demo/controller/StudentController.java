package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService stdser;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
    }

    @GetMapping("/getall")
    public List<Student> getAllStudent(){
        return stdser.getAllStudents();
    }
}
