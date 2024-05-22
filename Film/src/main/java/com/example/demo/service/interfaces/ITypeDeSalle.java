package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.TypeDeSalle;

public interface ITypeDeSalle{
    TypeDeSalle saveTypeDeSalle(TypeDeSalle typeDeSalle);
    TypeDeSalle updateTypeDeSalle(TypeDeSalle typeDeSalle);
    boolean deleteTypeDeSalle(Long id);
    List<TypeDeSalle> getAllTypesDeSalle();
    TypeDeSalle getTypeDeSalle(Long id);
    // Ajoutez d'autres méthodes personnalisées si nécessaire
}

