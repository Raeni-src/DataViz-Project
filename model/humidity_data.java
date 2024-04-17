package com.weather.spring.weatherspring.model;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name="humidity_data")
public class humidity_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Float humidity_level;
    Integer location_id;
    //timestamp declaration
    Timestamp time;
    //from() method obtains an instance of timestamp from an instant object
    Timestamp instant = Timestamp.from(Instant.now());

    public Integer getId(){
        return id;
    }
    public float getHumidity_level(){
        return humidity_level;
    }
    public void setHumidity_level(Float humidity_level){
        this.humidity_level=humidity_level;
    }
    public Integer getLocation_id(){
        return location_id;
    }
    public void setLocation_id(Integer location_id){
        this.location_id=location_id;
    }
    /* timestamp getter & setter method*/
    public Timestamp getTime(Timestamp time){
        return time;
    }
    public void setTime(Timestamp time){
        this.instant= time;
    }


}
