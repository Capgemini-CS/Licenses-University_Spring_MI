package com.example.capgemini.licenseuniversity.entity.dto;

import com.example.capgemini.licenseuniversity.entity.TemeLicenta;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private Integer id_student;
    private String firstName;
    private String lastName;
    private String cnp;
    private Integer age;
    private TemeLicenta teme_licenta;
}
