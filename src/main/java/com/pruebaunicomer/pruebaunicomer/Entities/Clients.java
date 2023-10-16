package com.pruebaunicomer.pruebaunicomer.Entities;

import java.sql.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="clients")
public class Clients {
    @Id
    @GeneratedValue ()
    private Integer id;
    
    @Basic
    private String first_Name;
    private String last_Name;
    private Date birthday;
    private String gender;
    private String cellphone;
    private String home_phone;
    private String address_Home;
    private String profession;
    private Integer incomes;
    

}