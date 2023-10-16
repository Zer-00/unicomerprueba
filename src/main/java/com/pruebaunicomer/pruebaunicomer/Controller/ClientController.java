package com.pruebaunicomer.pruebaunicomer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaunicomer.pruebaunicomer.Entities.Clients;
import com.pruebaunicomer.pruebaunicomer.Services.ClientServices;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {
    @Autowired
    private ClientServices clientServices;

    @GetMapping("/get")
    public List<Clients> getClients() {
        return (List<Clients>) clientServices.getClients();
    }

    @PostMapping("/create")
    public Clients createClients(@RequestBody Clients clients) {
        return clientServices.createClient(clients);
    }

    @PutMapping("/update/{id}")
    public String updateClient(@PathVariable Integer id, @RequestBody Clients updatedClient) {
        Clients updated = clientServices.updateClient(id, updatedClient);

        if (updated != null) {
            return "Client has been updated successfully";
        } else {
            return "Client not found"; 
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteClient(@PathVariable Integer id) {
        clientServices.deleteClient(id);
        return "Client has been deleted successfully.";
    }

}
