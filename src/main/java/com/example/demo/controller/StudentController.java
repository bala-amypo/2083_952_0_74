package com.example.demo.controller;
import org.springframework.beans..factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RESTController
public class StudentController{
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
    }
}
