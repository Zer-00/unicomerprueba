package com.pruebaunicomer.pruebaunicomer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebaunicomer.pruebaunicomer.Entities.Clients;

@Repository
public interface ClientRepository extends JpaRepository<Clients,Integer> {
    
}
