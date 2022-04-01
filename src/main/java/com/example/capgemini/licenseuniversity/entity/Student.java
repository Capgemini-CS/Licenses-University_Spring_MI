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
        @Column(name = "id_Student")
    private Integer idStudent;
    private String firstName;
    private String lastName;
        @Column(unique = true, nullable = false, length = 13)
    private String cnp;
        @Column(nullable = false)
    private Integer age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "license_theme_name")
    private LicensedTheme licensedTheme;
}
