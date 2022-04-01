package com.example.capgemini.licenseuniversity.repository;

import com.example.capgemini.licenseuniversity.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Integer> {
}
