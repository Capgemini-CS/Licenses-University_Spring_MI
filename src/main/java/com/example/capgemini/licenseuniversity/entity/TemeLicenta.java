package com.example.capgemini.licenseuniversity.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="temelicenta")
public class TemeLicenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer homework_id;
    private String name;
    private Integer noPages;
    private boolean hasApplication;

    @OneToOne(mappedBy = "teme_licenta")
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    private Profesor profesor;
}
