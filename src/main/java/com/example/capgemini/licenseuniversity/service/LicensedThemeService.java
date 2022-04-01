package com.example.capgemini.licenseuniversity.service;

import com.example.capgemini.licenseuniversity.entity.LicensedTheme;
import com.example.capgemini.licenseuniversity.entity.dto.LicensedThemeDTO;
import com.example.capgemini.licenseuniversity.repository.LicensedThemeRepository;
import com.example.capgemini.licenseuniversity.service.mapper.LicensedThemeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LicensedThemeService {

    private final LicensedThemeRepository licensedThemeRepository;

    @Autowired
    public LicensedThemeService(LicensedThemeRepository licensedThemeRepository) {
        this.licensedThemeRepository = licensedThemeRepository;
    }


    public List<LicensedThemeDTO> getAllLicensedTheme(){
        return licensedThemeRepository.findAll().stream().map(LicensedThemeMapper::toLicensedThemeDTO).collect(Collectors.toList());
    }


    public LicensedThemeDTO addLicensedTheme(LicensedThemeDTO licensedThemeDTO){
        LicensedTheme licensedTheme = licensedThemeRepository.save(LicensedThemeMapper.toLicensedTheme(licensedThemeDTO));
        return LicensedThemeMapper.toLicensedThemeDTO(licensedTheme);
    }
}
