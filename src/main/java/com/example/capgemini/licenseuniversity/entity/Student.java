package com.example.capgemini.licenseuniversity.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="students")
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_student;
    private String firstName;
    private String lastName;
        @Column(unique = true, nullable = false, length = 13)
    private String cnp;
        @Column(nullable = false, length = 2)
    private Integer age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "homework_id")
    private TemeLicenta teme_licenta;
}
