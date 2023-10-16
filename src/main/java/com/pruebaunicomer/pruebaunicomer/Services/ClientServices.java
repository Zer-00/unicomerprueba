package com.pruebaunicomer.pruebaunicomer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaunicomer.pruebaunicomer.Entities.Clients;
import com.pruebaunicomer.pruebaunicomer.Repository.ClientRepository;

@Service
public class ClientServices {
    @Autowired 
    private ClientRepository clientRepository;

    public Clients createClient(Clients clients){
        return clientRepository.save(clients);
    }

    public List<Clients> getClients(){
        return (List<Clients>) clientRepository.findAll();
    }
    
    public void deleteClient(Integer id){
        clientRepository.deleteById(id);
    }
}