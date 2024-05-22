package com.example.demo.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


import java.util.List;
import java.io.Serializable;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Programme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private SalleDeCinema salleDeCinema;
   
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Film film;
    @OneToMany(mappedBy = "programme", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Reservation> reservations;
    private int capacite;
    private String dateDebut;
    private String heureDebut;

    // Constructors, getters, and setters
}
