package com.example.jerseyspringboot.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="personne")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="firstname", nullable = false)
    private String nom;

    @Column(name="secondname", nullable = false)
    private String prenom;

    private int age;

}
