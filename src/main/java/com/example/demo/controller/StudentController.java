package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RESTController
public class StudentController{
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return 
    }
}
