package com.example.capgemini.licenseuniversity.entity.dto;

import com.example.capgemini.licenseuniversity.entity.LicensedTheme;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private Integer idStudent;
    private String firstName;
    private String lastName;
    private String cnp;
    private Integer age;
    private LicensedTheme licensedTheme;
}
