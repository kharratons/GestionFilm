package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.RealisateurRepository;
import com.example.demo.persistance.entities.Realisateur;
import com.example.demo.service.interfaces.IRealisateur;

@Service
public class RealisateurService implements IRealisateur {

    @Autowired
    private RealisateurRepository realisateurRepository;

    @Override
    public Realisateur saveRealisateur(Realisateur realisateur) {
        return realisateurRepository.save(realisateur);
    }

    @Override
    public Realisateur updateRealisateur(Realisateur realisateur) {
        return realisateurRepository.saveAndFlush(realisateur);
    }

    @Override
    public boolean deleteRealisateur(Long id) {
        realisateurRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Realisateur> getAllRealisateurs() {
        return realisateurRepository.findAll();
    }

    @Override
    public Realisateur getRealisateur(Long id) {
        return realisateurRepository.findById(id).orElse(null);
    }

    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
