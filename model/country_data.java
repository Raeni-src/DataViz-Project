package com.weather.spring.weatherspring.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "country_data")
public class country_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  //creating the tables 
    Integer country_id;
    String country_name;
    String continent;
//getter & setter methods
public Integer getCountry_id(){
    return country_id;
}
public void setCountry_id(Integer country_id){
    this.country_id=country_id;
}
public String getCountry_name(){
    return country_name;
}
public void setCountry_name(String country_name){
    this.country_name=country_name;
}
public String getContinent(){
    return continent;
}
public void setcontinent(String continent){
    this.continent=continent;
}   
}
