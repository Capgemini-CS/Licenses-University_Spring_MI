package com.example.capgemini.licenseuniversity.service;

import com.example.capgemini.licenseuniversity.entity.Profesor;
import com.example.capgemini.licenseuniversity.entity.dto.ProfesorDTO;
import com.example.capgemini.licenseuniversity.repository.ProfesorRepository;
import com.example.capgemini.licenseuniversity.service.mapper.ProfesorMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfesorService {

    private final ProfesorRepository profesorRepository;


    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    public List<ProfesorDTO> getAllProfessors(){
        return profesorRepository.findAll().stream().map(ProfesorMapper::toProfesorDTO).collect(Collectors.toList());
    }


    public ProfesorDTO addProfesor(ProfesorDTO profesorDTO){
        Profesor profesor = profesorRepository.save(ProfesorMapper.toProfesor(profesorDTO));
        return ProfesorMapper.toProfesorDTO(profesor);
    }
}
