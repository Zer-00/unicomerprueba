package com.pruebaunicomer.pruebaunicomer.Entities;

import java.sql.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clients")
public class Clients {
    @Id
    @GeneratedValue ()
    private Integer id;
    
    @Basic
    private String first_name;
    private String last_name;
    private Date birthday;
    private String gender;
    private String cellphone;
    private String home_phone;
    private String address_home;
    private String profession;
    private Integer incomes;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCellphone() {
        return cellphone;
    }
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
    public String getHome_phone() {
        return home_phone;
    }
    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
    }
    public String getAddress_home() {
        return address_home;
    }
    public void setAddress_home(String address_home) {
        this.address_home = address_home;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public Integer getIncomes() {
        return incomes;
    }
    public void setIncomes(Integer incomes) {
        this.incomes = incomes;
    }

    
  

}