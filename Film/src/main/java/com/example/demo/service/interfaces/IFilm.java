package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.Film;

public interface IFilm{
    Film saveFilm(Film film);
    Film updateFilm(Film film);
    boolean deleteFilm(Long id);
    List<Film> getAllFilms();
    Film getFilm(Long id);
    Film getFilmByTitre(String titre);
    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
