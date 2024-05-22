package com.example.demo.service.controller;

import com.example.demo.persistance.entities.TypeDeSalle;
import com.example.demo.service.interfaces.ITypeDeSalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/typeDeSalle")
public class TypeDeSalleController {

    @Autowired
    private ITypeDeSalle typeDeSalleService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    TypeDeSalle save(@RequestBody TypeDeSalle typeDeSalle) {
        System.out.println("*******save TypeDeSalle ***********");
        return typeDeSalleService.saveTypeDeSalle(typeDeSalle);
    }

    @GetMapping("/{id}")
    TypeDeSalle getTypeDeSalleById(@PathVariable Long id) {
        return typeDeSalleService.getTypeDeSalle(id);
    }

    @GetMapping("/all")
    List<TypeDeSalle> getAllTypesDeSalle() {
        return typeDeSalleService.getAllTypesDeSalle();
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        typeDeSalleService.deleteTypeDeSalle(id);
        return true;
    }

    @PutMapping("/update")
    TypeDeSalle updateTypeDeSalle(@RequestBody TypeDeSalle typeDeSalle) {
        return typeDeSalleService.updateTypeDeSalle(typeDeSalle);
    }
}
