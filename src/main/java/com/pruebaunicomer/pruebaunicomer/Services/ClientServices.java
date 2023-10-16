package com.pruebaunicomer.pruebaunicomer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaunicomer.pruebaunicomer.Entities.Clients;
import com.pruebaunicomer.pruebaunicomer.Repository.ClientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientServices {
    @Autowired 
    private ClientRepository clientRepository;

    public Clients createClient(Clients clients){
        return clientRepository.save(clients);
    }

    public List<Clients> getClients(){
        return (List<Clients>) clientRepository.findAll();
    }

  
     public Clients updateClient(Clients clients, Integer id){
        clientRepository.findById(id);
        return clientRepository.save(clients);
    }
    
    public void deleteClient(Integer id){
        clientRepository.deleteById(id);
    }
}
