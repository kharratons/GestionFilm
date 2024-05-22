package com.example.demo.service.controller;

import com.example.demo.persistance.entities.SalleDeCinema;
import com.example.demo.service.interfaces.ISalleDeCinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/salle-de-cinema")
public class SalleDeCinemaController {

    @Autowired
    ISalleDeCinema salleDeCinemaService;

    @PostMapping("/save")
    SalleDeCinema save(@RequestBody SalleDeCinema salleDeCinema) {
        System.out.println("*******save SalleDeCinema***********");
        SalleDeCinema savedSalle = salleDeCinemaService.saveSalleDeCinema(salleDeCinema);
        System.out.println("*******" );
        return savedSalle;
    }

    @GetMapping("/{id}")
    SalleDeCinema getSalleDeCinemaById(@PathVariable Long id) {
        return salleDeCinemaService.getSalleDeCinema(id);
    }

    @GetMapping("/all")
    List<SalleDeCinema> getAllSallesDeCinema() {
        return salleDeCinemaService.getAllSallesDeCinema();
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        salleDeCinemaService.deleteSalleDeCinema(id);
        return true;
    }

    @PutMapping("/update")
    SalleDeCinema updateSalleDeCinema(@RequestBody SalleDeCinema salleDeCinema) {
        return salleDeCinemaService.updateSalleDeCinema(salleDeCinema);
    }
}
