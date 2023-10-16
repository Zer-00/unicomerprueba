package com.pruebaunicomer.pruebaunicomer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaunicomer.pruebaunicomer.Entities.Clients;
import com.pruebaunicomer.pruebaunicomer.Repository.ClientRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired 
    private ClientRepository clientRepository;

    @GetMapping("/get")
    public List<Clients> getClients(){
        return (List<Clients>) clientRepository.findAll();
    }

    @PostMapping("/create")
    public String createClients(Clients clients){
        System.out.println("pruebaaaaa"+clients);
         clientRepository.save(clients);
         return "Client has been created successfully.";
    }
    @PutMapping("/edit")
    public String editClients(Clients clients){
         clientRepository.save(clients);
         return "Client has been edit successfully";
    }
    @DeleteMapping(value="/delete/{id}")
    public String deleteClient(@PathVariable Integer id){
        clientRepository.deleteById(id);
        return "Client has been deleted successfully.";
    }
    
}
