package com.example.capgemini.licenseuniversity.entity.dto;

import com.example.capgemini.licenseuniversity.entity.LicensedTheme;
import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorDTO {

    private Integer idProfesor;
    private String firstName;
    private String lastName;
    private String subject;
    private Integer old;
    private List<LicensedTheme> licensesList;
}
