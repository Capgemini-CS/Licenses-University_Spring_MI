package com.example.capgemini.licenseuniversity.service;

import com.example.capgemini.licenseuniversity.entity.Professor;
import com.example.capgemini.licenseuniversity.entity.dto.ProfessorDTO;
import com.example.capgemini.licenseuniversity.repository.ProfessorRepository;
import com.example.capgemini.licenseuniversity.service.mapper.ProfessorMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<ProfessorDTO> getAllProfessors(){
        return professorRepository.findAll().stream().map(ProfessorMapper::toProfessorDTO).collect(Collectors.toList());
    }


    public ProfessorDTO addProfesor(ProfessorDTO profesorDTO){
        Professor professor = professorRepository.save(ProfessorMapper.toProfessor(profesorDTO));
        return ProfessorMapper.toProfessorDTO(professor);
    }
}
