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
import com.pruebaunicomer.pruebaunicomer.Services.ClientServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {
    @Autowired 
    private ClientServices clientServices;

    @GetMapping("/get")
    public List<Clients> getClients(){
        return (List<Clients>) clientServices.getClients();
    }

    @PostMapping("/create")
    public void createClients(@RequestBody Clients clients){
        clientServices.createClient(clients);
         
    }
    @PutMapping("/update")
    public String updateClient(Clients clients){
         clientServices.updateClient(clients);
         return "Client has been edit successfully";
    }
    @DeleteMapping(value="/delete/{id}")
    public String deleteClient(@PathVariable Integer id){
        clientServices.deleteClient(id);
        return "Client has been deleted successfully.";
    }
    
}
