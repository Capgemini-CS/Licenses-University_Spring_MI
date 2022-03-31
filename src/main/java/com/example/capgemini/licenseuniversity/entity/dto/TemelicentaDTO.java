package com.example.capgemini.licenseuniversity.entity.dto;

import com.example.capgemini.licenseuniversity.entity.Profesor;
import com.example.capgemini.licenseuniversity.entity.Student;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TemelicentaDTO {
    private Integer homework_id;
    private String name;
    private Integer noPages;
    private boolean hasApplication;
    private Student student;
    private Profesor profesor;
}
