package com.example.capgemini.licenseuniversity.service.mapper;

import com.example.capgemini.licenseuniversity.entity.Student;
import com.example.capgemini.licenseuniversity.entity.dto.StudentDTO;

public class StudentMapper {

    public static StudentDTO toStudentDTO (Student student){
        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setIdStudent(student.getIdStudent());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setAge(student.getAge());
        studentDTO.setLicensedTheme(student.getLicensedTheme());

        return studentDTO;
    }


    public static Student toStudent(StudentDTO studentDTO){
        Student student = new Student();

        student.setIdStudent(studentDTO.getIdStudent());
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setCnp(studentDTO.getCnp());
        student.setAge(studentDTO.getAge());
        student.setLicensedTheme(studentDTO.getLicensedTheme());

        return student;
    }
}
