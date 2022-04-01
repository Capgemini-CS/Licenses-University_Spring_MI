package com.example.capgemini.licenseuniversity.entity.dto;

import com.example.capgemini.licenseuniversity.entity.Professor;
import com.example.capgemini.licenseuniversity.entity.Student;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LicensedThemeDTO {
    private Integer idLicensedTheme;
    private String licenseThemeName;
    private Integer numberOfPages;
    private boolean hasApplication;
    private Student student;
    private Professor profesor;
}
