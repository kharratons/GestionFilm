package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.persistance.entities.Programme;
import com.example.demo.service.interfaces.IProgramme;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/programme")
public class ProgrammeController {

    @Autowired
    IProgramme programmeService;

    @PostMapping("/save")
    Programme save(@RequestBody Programme programme) {
        System.out.println("*******save Programme***********");
        Programme savedProgramme = programmeService.saveProgramme(programme);
        System.out.println("*******"); 
        return savedProgramme;
    }

    @GetMapping("/{id}")
    Programme getProgrammeById(@PathVariable Long id) {
        return programmeService.getProgramme(id);
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        programmeService.deleteProgramme(id);
        return true;
    }

    @GetMapping("/all")
    List<Programme> getAllProgrammes() {
        return programmeService.getAllProgrammes();
    }

    @PutMapping("/update")
    Programme updateProgramme(@RequestBody Programme programme) {
        return programmeService.updateProgramme(programme);
    }
}
