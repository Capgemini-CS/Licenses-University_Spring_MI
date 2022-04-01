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

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_profesor")
    private Integer idProfesor;
    private String firstName;
    private String lastName;
    private String subject;
    private Integer old;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_theme")
    private List<LicensedTheme> licensesList;
}
