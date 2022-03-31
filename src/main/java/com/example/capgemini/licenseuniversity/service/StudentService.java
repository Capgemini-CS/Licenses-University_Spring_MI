package com.example.capgemini.licenseuniversity.service;

import com.example.capgemini.licenseuniversity.entity.Student;
import com.example.capgemini.licenseuniversity.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    //public List<Student> getAllStudents(){  }

}
