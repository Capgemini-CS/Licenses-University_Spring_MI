package com.example.capgemini.licenseuniversity.controller;

import com.example.capgemini.licenseuniversity.entity.dto.ProfesorDTO;
import com.example.capgemini.licenseuniversity.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    private final ProfesorService profesorService;

    @Autowired
    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }


    @GetMapping(value = "/all")
    public ResponseEntity<List<ProfesorDTO>> getAllProfessors(){
        return new ResponseEntity<>(profesorService.getAllProfessors(), HttpStatus.OK);
    }


    @PostMapping(value = "/post")
    public ResponseEntity<ProfesorDTO> addProfesor(@RequestBody ProfesorDTO profesorDTO){
        return new ResponseEntity<>(profesorService.addProfesor(profesorDTO),HttpStatus.CREATED);
    }
}
