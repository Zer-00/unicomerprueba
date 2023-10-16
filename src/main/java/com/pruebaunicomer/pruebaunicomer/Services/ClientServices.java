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

  
    public Clients updateClient(Integer id, Clients updatedClient){
        Clients existingClient = clientRepository.findById(id).orElse(null);
        
        if (existingClient != null) {
            existingClient.setFirst_name(updatedClient.getFirst_name());
            existingClient.setLast_name(updatedClient.getLast_name());
            existingClient.setAddress_home(updatedClient.getAddress_home());
            existingClient.setBirthday(updatedClient.getBirthday());
            existingClient.setCellphone(updatedClient.getCellphone());
            existingClient.setGender(updatedClient.getGender());
            existingClient.setHome_phone(updatedClient.getHome_phone());
            existingClient.setIncomes(updatedClient.getIncomes());
            existingClient.setProfession(updatedClient.getProfession());
            

            return clientRepository.save(existingClient);
        } else {
            return null; 
        }
    }
    
    public void deleteClient(Integer id){
        clientRepository.deleteById(id);
    }
}
