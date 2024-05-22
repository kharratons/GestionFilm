package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.Client;

public interface IClient {
	Client saveClient(Client Client);
    Client updateClient(Client Client);
    boolean deleteClient(Long id);
    List<Client> getListClient();
    Client getClient(Long id);
    Client findClientByName(String name);
    int getQuantityOfClient();
    Client getClientByIdClient(Long id);
	 List<Client> getAllClients();

}
