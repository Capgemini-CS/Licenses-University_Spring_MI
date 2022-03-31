package com.example.capgemini.licenseuniversity.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="professors")

public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProfesor;
    private String firstName;
    private String lastName;
        @Enumerated(value = EnumType.STRING)
    private Subjects subject;
    private Integer old;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "homework_id")
    private List<TemeLicenta> licensesList;
}
