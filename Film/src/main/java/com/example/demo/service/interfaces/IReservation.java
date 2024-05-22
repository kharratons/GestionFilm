package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.Reservation;

public interface IReservation {
    Reservation saveReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    boolean deleteReservation(Long id);
    List<Reservation> getAllReservations();
    Reservation getReservation(Long id);
    // Ajoutez d'autres méthodes personnalisées si nécessaire
}
