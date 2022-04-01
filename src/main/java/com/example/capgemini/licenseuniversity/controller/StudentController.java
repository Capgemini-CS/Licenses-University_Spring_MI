package com.example.capgemini.licenseuniversity.controller;

import com.example.capgemini.licenseuniversity.entity.dto.StudentDTO;
import com.example.capgemini.licenseuniversity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/students")
@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<StudentDTO>> getAllStudents(){
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentDTO studentDTO){
        return new ResponseEntity<>(studentService.addStudent(studentDTO),HttpStatus.CREATED);
    }
}
