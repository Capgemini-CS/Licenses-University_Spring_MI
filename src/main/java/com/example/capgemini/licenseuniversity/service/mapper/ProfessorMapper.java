package com.example.capgemini.licenseuniversity.service.mapper;

import com.example.capgemini.licenseuniversity.entity.Professor;
import com.example.capgemini.licenseuniversity.entity.dto.ProfessorDTO;

public class ProfessorMapper {

    public static ProfessorDTO toProfessorDTO(Professor professor){
        ProfessorDTO profesorDTO = new ProfessorDTO();

        profesorDTO.setIdProfesor(professor.getIdProfesor());
        profesorDTO.setFirstName(professor.getFirstName());
        profesorDTO.setLastName(professor.getLastName());
        profesorDTO.setSubject(professor.getSubject());
        profesorDTO.setOld(professor.getOld());
        profesorDTO.setLicensesList(professor.getLicensesList());

        return profesorDTO;
    }


    public static Professor toProfessor(ProfessorDTO professorDTO){
        Professor profesor = new Professor();

        profesor.setIdProfesor(professorDTO.getIdProfesor());
        profesor.setFirstName(professorDTO.getFirstName());
        profesor.setLastName(professorDTO.getLastName());
        profesor.setSubject(professorDTO.getSubject());
        profesor.setOld(professorDTO.getOld());
        profesor.setLicensesList(professorDTO.getLicensesList());

        return profesor;
    }
}
