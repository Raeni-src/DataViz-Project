package com.weather.spring.weatherspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name= "sunrise_sunset_data")
public class sunrise_sunset_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id, location_id;
    Timestamp sunrise_time, sunset_time, time;
    
    public Integer getId(){
        return id;
    }
    public Integer getLocation_id(){
        return location_id;
    }
    public void setLocation_id(Integer location_id){
        this.location_id=location_id;
    }
    
    Timestamp instant = Timestamp.from(Instant.now());
    public Timestamp getTime(Timestamp time){
        return time;
    }
    public void setTime(Timestamp time){
        this.instant= time;
    }
    public Timestamp getsunset_Time(Timestamp sunset_time){
        return sunset_time;
    }
     public void setsunset_Time(Timestamp sunset_time){
        this.instant = sunset_time;
     }
    public Timestamp getsunrise_Time(Timestamp sunrise_time){
       return sunrise_time;
    }
    public void setsunrise_Time(Timestamp sunrise_time){
        this.instant = sunrise_time;
    }





}
