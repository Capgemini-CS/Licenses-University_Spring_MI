package com.example.capgemini.licenseuniversity.controller;

import com.example.capgemini.licenseuniversity.entity.dto.LicensedThemeDTO;
import com.example.capgemini.licenseuniversity.service.LicensedThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licensetheme")
public class LicenseThemeController {

    private final LicensedThemeService licensedThemeService;

    @Autowired
    public LicenseThemeController(LicensedThemeService licensedThemeService) {
        this.licensedThemeService = licensedThemeService;
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<LicensedThemeDTO>> getAllLicensedTheme(){
        return new ResponseEntity<>(licensedThemeService.getAllLicensedTheme(), HttpStatus.OK);
    }

    @PostMapping(value ="/")
    public ResponseEntity<LicensedThemeDTO> addLicensedTheme(@RequestBody LicensedThemeDTO licensedThemeDTO){
        return new ResponseEntity<>(licensedThemeService.addLicensedTheme(licensedThemeDTO),HttpStatus.CREATED);
    }
}
