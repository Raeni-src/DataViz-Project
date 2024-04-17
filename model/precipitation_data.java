package com.weather.spring.weatherspring.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name="precipitation_data")
public class precipitation_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    Integer id;
    Integer location_id;
    Float precipitation_amount;
    //timestamp declaration below
    Timestamp time;
    Timestamp instant = Timestamp.from(Instant.now());

//getter & setter
public Integer getId(){
    return id;
}
public Integer getLocation_id(){
    return location_id;
}
public void setLocation_id(Integer location_id){
    this.location_id=location_id;
}
public float getPrecipitation_amount(){
    return precipitation_amount;
}
public void setPrecipitaion_amount(Float precipitation_amount){
    this.precipitation_amount=precipitation_amount;
}
 public Timestamp getTime(Timestamp time){
        return time;
    }
    public void setTime(Timestamp time){
        this.instant= time;
    }

}
