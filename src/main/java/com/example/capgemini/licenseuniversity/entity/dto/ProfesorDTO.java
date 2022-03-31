package com.example.capgemini.licenseuniversity.entity.dto;

import com.example.capgemini.licenseuniversity.entity.TemeLicenta;
import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfesorDTO {

    private Integer idProfesor;
    private String firstName;
    private String lastName;
    private String subject;
    private Integer old;
    private List<TemeLicenta> licensesList;
}
