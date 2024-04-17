package com.weather.spring.weatherspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name= "town")
public class town_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer location_id;
    String town_name;
    Integer country_id;

    public Integer getLocation_id(){
        return location_id;
    }
    public void setLocation_id(Integer location_id){
        this.location_id=location_id;
    }
    public String getTown_name(){
        return town_name;
    }
    public void setTown_name(String town_name){
        this.town_name=town_name;
    }
    public Integer Country_id(){
        return country_id;
    }
    public void setCountry_id(Integer country_id){
        this.country_id=country_id;
    }   
}