package com.example.capgemini.licenseuniversity.controller;

import com.example.capgemini.licenseuniversity.entity.dto.ProfessorDTO;
import com.example.capgemini.licenseuniversity.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorService professorService;

    @Autowired
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }


    @GetMapping(value = "/")
    public ResponseEntity<List<ProfessorDTO>> getAllProfessors(){
        return new ResponseEntity<>(professorService.getAllProfessors(), HttpStatus.OK);
    }


    @PostMapping(value = "/")
    public ResponseEntity<ProfessorDTO> addProfesor(@RequestBody ProfessorDTO professorDTO){
        return new ResponseEntity<>(professorService.addProfesor(professorDTO),HttpStatus.CREATED);
    }
}
