package com.example.capgemini.licenseuniversity.service;

import com.example.capgemini.licenseuniversity.entity.Student;
import com.example.capgemini.licenseuniversity.entity.dto.StudentDTO;
import com.example.capgemini.licenseuniversity.repository.StudentRepository;
import com.example.capgemini.licenseuniversity.service.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<StudentDTO> getAllStudents(){
        return studentRepository.findAll().stream().map(StudentMapper::toStudentDTO).collect(Collectors.toList());
    }


    public StudentDTO addStudent(StudentDTO studentDTO){
        Student student = studentRepository.save(StudentMapper.toStudent(studentDTO));
        return StudentMapper.toStudentDTO(student);
    }

}
