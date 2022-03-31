package com.example.capgemini.licenseuniversity.controller;

import com.example.capgemini.licenseuniversity.entity.dto.TemelicentaDTO;
import com.example.capgemini.licenseuniversity.service.TemelicentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teme")
public class TemelicenteController {

    private final TemelicentaService temelicentaService;

    @Autowired
    public TemelicenteController(TemelicentaService temelicentaService) {
        this.temelicentaService = temelicentaService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<TemelicentaDTO>> getAllTeme(){
        return new ResponseEntity<>(temelicentaService.getAllTemelicenta(), HttpStatus.OK);
    }

    @PostMapping(value ="/post")
    public ResponseEntity<TemelicentaDTO> addTema(@RequestBody TemelicentaDTO temelicentaDTO){
        return new ResponseEntity<>(temelicentaService.addTemaLicenta(temelicentaDTO),HttpStatus.CREATED);
    }
}
