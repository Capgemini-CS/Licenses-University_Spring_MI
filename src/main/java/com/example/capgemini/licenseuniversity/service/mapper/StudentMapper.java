package com.example.capgemini.licenseuniversity.service.mapper;

import com.example.capgemini.licenseuniversity.entity.Student;
import com.example.capgemini.licenseuniversity.entity.dto.StudentDTO;

public class StudentMapper {

    public static StudentDTO toStudentDTO (Student student){
        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId_student(student.getId_student());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setCnp(student.getCnp());
        studentDTO.setAge(student.getAge());
        studentDTO.setTeme_licenta(student.getTeme_licenta());

        return studentDTO;
    }


    public static Student toStudent(StudentDTO studentDTO){
        Student student = new Student();

        student.setId_student(studentDTO.getId_student());
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setCnp(studentDTO.getCnp());
        student.setAge(studentDTO.getAge());
        student.setTeme_licenta(studentDTO.getTeme_licenta());

        return student;
    }
}
