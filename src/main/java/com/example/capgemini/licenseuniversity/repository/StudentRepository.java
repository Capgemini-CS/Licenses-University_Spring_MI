package com.example.capgemini.licenseuniversity.repository;

import com.example.capgemini.licenseuniversity.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
