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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirst_Name() {
        return first_Name;
    }
    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }
    public String getLast_Name() {
        return last_Name;
    }
    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
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
    public String getAddress_Home() {
        return address_Home;
    }
    public void setAddress_Home(String address_Home) {
        this.address_Home = address_Home;
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