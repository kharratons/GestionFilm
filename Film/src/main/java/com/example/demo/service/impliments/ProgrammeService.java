package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.ProgrammeRepository;
import com.example.demo.persistance.entities.Programme;
import com.example.demo.service.interfaces.IProgramme;

@Service
public class ProgrammeService implements IProgramme {

    @Autowired
    private ProgrammeRepository programmeRepository;

    @Override
    public Programme saveProgramme(Programme programme) {
        return programmeRepository.save(programme);
    }

    @Override
    public Programme updateProgramme(Programme programme) {
        return programmeRepository.saveAndFlush(programme);
    }

    @Override
    public boolean deleteProgramme(Long id) {
        programmeRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Programme> getAllProgrammes() {
        return programmeRepository.findAll();
    }

    @Override
    public Programme getProgramme(Long id) {
        return programmeRepository.findById(id).orElse(null);
    }

    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
