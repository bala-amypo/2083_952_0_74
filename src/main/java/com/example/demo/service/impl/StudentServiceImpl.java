package com.example.demo.service.impl;

import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;
import 
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository stdrepo;
    @Override
    public Student poststudent(Student st){
        return 
    }
}


