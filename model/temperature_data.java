package com.weather.spring.weatherspring.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.time.Instant;


@Entity
@Table(name="temperature_data")
public class temperature_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Integer location_id;
    Timestamp time;
    Float temperature;

    public Integer getId(){
        return id;
    }
    public Integer getLocation_id(){
        return location_id;
    }
    public void setLocation_id(Integer location_id){
        this.location_id=location_id;
    }
    /* timestamp getter & setter method
    
    */
    public float getTemperature(){
        return temperature;
    }
    public void setTemperature(Float temperature){
        this.temperature=temperature;
    }

    Timestamp instant = Timestamp.from(Instant.now());
    public Timestamp getTime(Timestamp time){
        return time;
    }
    public void setTime(Timestamp time){
        this.instant= time;
    }
}
