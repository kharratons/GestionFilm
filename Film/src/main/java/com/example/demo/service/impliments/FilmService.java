package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.FilmRepository;
import com.example.demo.persistance.entities.Film;
import com.example.demo.service.interfaces.IFilm;

@Service
public class FilmService implements IFilm {

    @Autowired
    private FilmRepository filmRepository;

    @Override
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Film updateFilm(Film film) {
        return filmRepository.saveAndFlush(film);
    }

    @Override
    public boolean deleteFilm(Long id) {
        filmRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public Film getFilm(Long id) {
        return filmRepository.findById(id).orElse(null);
    }
    
    @Override
    public Film getFilmByTitre(String titre) {
    	return filmRepository.findByTitre(titre);
    }
    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
