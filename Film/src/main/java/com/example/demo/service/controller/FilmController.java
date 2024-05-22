package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.persistance.entities.Film;
import com.example.demo.service.interfaces.IFilm;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/film")
public class FilmController {

    @Autowired
    private IFilm filmService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    Film save(@RequestBody Film film) {
        System.out.println("******* Save Film ***********");
        Film savedFilm = filmService.saveFilm(film);
        System.out.println("******* Film Title: " + savedFilm.getTitre());
        return savedFilm;
    }

    @GetMapping("/{id}")
    Film getFilmById(@PathVariable Long id) {
        return filmService.getFilm(id);
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        filmService.deleteFilm(id);
        return true;
    }

    @GetMapping("/all")
    List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }

    @PutMapping("/update")
    Film updateFilm(@RequestBody Film film) {
        return filmService.updateFilm(film);
    }
}
