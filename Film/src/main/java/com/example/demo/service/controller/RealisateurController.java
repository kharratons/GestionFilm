package com.example.demo.service.controller;

import com.example.demo.persistance.entities.Realisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.interfaces.IRealisateur;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/realisateur")
public class RealisateurController {

    @Autowired
    IRealisateur realisateurService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    Realisateur save(@RequestBody Realisateur realisateur) {
        System.out.println("******* Save Realisateur ***********");
        return realisateurService.saveRealisateur(realisateur);
    }

    @GetMapping("/{id}")
    Realisateur getRealisateurById(@PathVariable Long id) {
        return realisateurService.getRealisateur(id);
    }

    @GetMapping("/all")
    List<Realisateur> getAllRealisateurs() {
        return realisateurService.getAllRealisateurs();
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        realisateurService.deleteRealisateur(id);
        return true;
    }

    @PutMapping("/update")
    Realisateur updateRealisateur(@RequestBody Realisateur realisateur) {
        return realisateurService.updateRealisateur(realisateur);
    }
}
