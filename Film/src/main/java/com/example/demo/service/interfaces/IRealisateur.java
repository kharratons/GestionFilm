package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.Realisateur;

public interface IRealisateur {
    Realisateur saveRealisateur(Realisateur realisateur);
    Realisateur updateRealisateur(Realisateur realisateur);
    boolean deleteRealisateur(Long id);
    List<Realisateur> getAllRealisateurs();
    Realisateur getRealisateur(Long id);
    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
