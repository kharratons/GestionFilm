package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.persistance.entities.Client;
import com.example.demo.service.interfaces.IClient;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private IClient clientService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    Client save(@RequestBody Client client) {
        System.out.println("******* Save Client ***********");
        Client savedClient = clientService.saveClient(client);
        
        return savedClient;
    }

    @GetMapping("/{id}")
    Client getClientById(@PathVariable Long id) {
        return clientService.getClient(id);
    }

    @GetMapping("/quantity")
    int getQuantityClient() {
        return clientService.getQuantityOfClient();
    }

    @GetMapping("/clientByName/{name}")
    Client getClientByName(@PathVariable String name) {
        return clientService.findClientByName(name);
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        clientService.deleteClient(id);
        return true;
    }

    @GetMapping("/all")
    List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PutMapping("/update")
    Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }
}
