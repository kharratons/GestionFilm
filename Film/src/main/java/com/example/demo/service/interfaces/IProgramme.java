package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.Programme;

public interface IProgramme {
    Programme saveProgramme(Programme programme);
    Programme updateProgramme(Programme programme);
    boolean deleteProgramme(Long id);
    List<Programme> getAllProgrammes();
    Programme getProgramme(Long id);
    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
