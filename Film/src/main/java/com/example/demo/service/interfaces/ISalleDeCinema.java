package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.SalleDeCinema;

public interface ISalleDeCinema {
    SalleDeCinema saveSalleDeCinema(SalleDeCinema salleDeCinema);
    SalleDeCinema updateSalleDeCinema(SalleDeCinema salleDeCinema);
    boolean deleteSalleDeCinema(Long id);
    List<SalleDeCinema> getAllSallesDeCinema();
    SalleDeCinema getSalleDeCinema(Long id);
    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
