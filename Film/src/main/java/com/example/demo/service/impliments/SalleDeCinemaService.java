package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.SalleDeCinemaRepository;
import com.example.demo.persistance.entities.SalleDeCinema;
import com.example.demo.service.interfaces.ISalleDeCinema;

@Service
public class SalleDeCinemaService implements ISalleDeCinema {

    @Autowired
    private SalleDeCinemaRepository salleDeCinemaRepository;

    @Override
    public SalleDeCinema saveSalleDeCinema(SalleDeCinema salleDeCinema) {
        return salleDeCinemaRepository.save(salleDeCinema);
    }

    @Override
    public SalleDeCinema updateSalleDeCinema(SalleDeCinema salleDeCinema) {
        return salleDeCinemaRepository.saveAndFlush(salleDeCinema);
    }

    @Override
    public boolean deleteSalleDeCinema(Long id) {
        salleDeCinemaRepository.deleteById(id);
        return true;
    }

    @Override
    public List<SalleDeCinema> getAllSallesDeCinema() {
        return salleDeCinemaRepository.findAll();
    }

    @Override
    public SalleDeCinema getSalleDeCinema(Long id) {
        return salleDeCinemaRepository.findById(id).orElse(null);
    }

    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
