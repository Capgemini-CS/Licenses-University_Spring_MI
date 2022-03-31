package com.example.capgemini.licenseuniversity.repository;

import com.example.capgemini.licenseuniversity.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
