package com.example.capgemini.licenseuniversity.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="temelicenta")
public class LicensedTheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_theme")
    private Integer idLicensedTheme;
        @Column(name = "license_theme_name")
    private String licenseThemeName;
    private Integer numberOfPages;
    private boolean hasApplication;

    @OneToOne(mappedBy = "licensedTheme")
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    private Professor profesor;
}
