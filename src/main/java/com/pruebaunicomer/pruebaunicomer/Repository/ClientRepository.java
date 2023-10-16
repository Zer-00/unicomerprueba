package com.pruebaunicomer.pruebaunicomer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebaunicomer.pruebaunicomer.Entities.Clients;

@Repository
public interface ClientRepository extends CrudRepository<Clients,Integer> {
    
}
