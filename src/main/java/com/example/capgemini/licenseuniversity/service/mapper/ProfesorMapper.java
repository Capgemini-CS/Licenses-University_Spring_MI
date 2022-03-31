package com.example.capgemini.licenseuniversity.service.mapper;

import com.example.capgemini.licenseuniversity.entity.Profesor;
import com.example.capgemini.licenseuniversity.entity.dto.ProfesorDTO;

public class ProfesorMapper {

    public static ProfesorDTO toProfesorDTO(Profesor profesor){
        ProfesorDTO profesorDTO = new ProfesorDTO();

        profesorDTO.setIdProfesor(profesor.getIdProfesor());
        profesorDTO.setFirstName(profesor.getFirstName());
        profesorDTO.setLastName(profesor.getLastName());
        profesorDTO.setSubject(profesor.getSubject());
        profesorDTO.setOld(profesor.getOld());
        profesorDTO.setLicensesList(profesor.getLicensesList());

        return profesorDTO;
    }


    public static Profesor toProduct(ProfesorDTO profesorDTO){
        Profesor profesor = new Profesor();

        profesor.setIdProfesor(profesorDTO.getIdProfesor());
        profesor.setFirstName(profesorDTO.getFirstName());
        profesor.setLastName(profesorDTO.getLastName());
        profesor.setSubject(profesorDTO.getSubject());
        profesor.setOld(profesorDTO.getOld());
        profesor.setLicensesList(profesorDTO.getLicensesList());

        return profesor;
    }
}
