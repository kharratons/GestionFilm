package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.TypeDeSalleRepository;
import com.example.demo.persistance.entities.TypeDeSalle;
import com.example.demo.service.interfaces.ITypeDeSalle;

@Service
public class TypeDeSalleService implements ITypeDeSalle {

    @Autowired
    private TypeDeSalleRepository typeDeSalleRepository;

    @Override
    public TypeDeSalle saveTypeDeSalle(TypeDeSalle typeDeSalle) {
        return typeDeSalleRepository.save(typeDeSalle);
    }

    @Override
    public TypeDeSalle updateTypeDeSalle(TypeDeSalle typeDeSalle) {
        return typeDeSalleRepository.saveAndFlush(typeDeSalle);
    }

    @Override
    public boolean deleteTypeDeSalle(Long id) {
        typeDeSalleRepository.deleteById(id);
        return true;
    }

    @Override
    public List<TypeDeSalle> getAllTypesDeSalle() {
        return typeDeSalleRepository.findAll();
    }

    @Override
    public TypeDeSalle getTypeDeSalle(Long id) {
        return typeDeSalleRepository.findById(id).orElse(null);
    }

    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
