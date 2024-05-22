package com.example.demo.persistance.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalleDeCinema implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;

    @ManyToOne
    @JoinColumn(name = "type_de_salle_id") // Ajoutez cette annotation pour spécifier la colonne de jointure
    private TypeDeSalle typeDeSalle;

    @OneToMany(mappedBy = "salleDeCinema", cascade = CascadeType.ALL)
    private List<Programme> programmes;
}
