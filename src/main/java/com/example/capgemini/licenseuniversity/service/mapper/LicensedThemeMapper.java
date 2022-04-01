package com.example.capgemini.licenseuniversity.service.mapper;

import com.example.capgemini.licenseuniversity.entity.LicensedTheme;
import com.example.capgemini.licenseuniversity.entity.dto.LicensedThemeDTO;

public class LicensedThemeMapper {

    public static LicensedThemeDTO toLicensedThemeDTO(LicensedTheme licensedTheme){
        LicensedThemeDTO temelicentaDTO = new LicensedThemeDTO();

        temelicentaDTO.setIdLicensedTheme(licensedTheme.getIdLicensedTheme());
        temelicentaDTO.setLicenseThemeName(licensedTheme.getLicenseThemeName());
        temelicentaDTO.setNumberOfPages(licensedTheme.getNumberOfPages());
        temelicentaDTO.setHasApplication(licensedTheme.isHasApplication());
        temelicentaDTO.setStudent(licensedTheme.getStudent());
        temelicentaDTO.setProfesor(licensedTheme.getProfesor());

        return temelicentaDTO;
    }


    public static LicensedTheme toLicensedTheme(LicensedThemeDTO licensedThemeDTO){
        LicensedTheme temeLicenta = new LicensedTheme();

        temeLicenta.setIdLicensedTheme(licensedThemeDTO.getIdLicensedTheme());
        temeLicenta.setLicenseThemeName(licensedThemeDTO.getLicenseThemeName());
        temeLicenta.setNumberOfPages(licensedThemeDTO.getNumberOfPages());
        temeLicenta.setHasApplication(licensedThemeDTO.isHasApplication());
        temeLicenta.setStudent(licensedThemeDTO.getStudent());
        temeLicenta.setProfesor(licensedThemeDTO.getProfesor());

        return temeLicenta;
    }

}
