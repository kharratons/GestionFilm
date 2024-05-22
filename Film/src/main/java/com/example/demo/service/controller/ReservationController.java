package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.persistance.entities.Reservation;
import com.example.demo.service.interfaces.IReservation;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    @Autowired
    IReservation reservationService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    Reservation save(@RequestBody Reservation reservation) {
        System.out.println("******* save reservation ***********");
        Reservation savedReservation = reservationService.saveReservation(reservation);
        System.out.println("*******" );
        return savedReservation;
    }

    @GetMapping("/{id}")
    Reservation getReservationById(@PathVariable Long id) {
        return reservationService.getReservation(id);
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        reservationService.deleteReservation(id);
        return true;
    }

    @GetMapping("/all")
    List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PutMapping("/update")
    Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }
}
