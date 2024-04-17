package com.weather.spring.weatherspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.time.Instant;


@Entity
@Table
public class weather_conditions_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String weather_icons;
    String weather_conditions;
    Integer location_id;
    Timestamp time;

    Timestamp instant = Timestamp.from(Instant.now());

    public Integer getId() {
        return id;
    }
    public String getWeather_icons() {
        return weather_icons;
    }
    public void setWeather_icons(String weather_icons) {
        this.weather_icons = weather_icons;
    }
    public String getWeather_conditions() {
        return weather_conditions;
    }
    public void setWeather_conditions(String weather_conditions) {
        this.weather_conditions = weather_conditions;
    }
    public Integer getLocation_id() {
        return location_id;
    }
    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }
    public Timestamp getTime(Timestamp time){
        return time;
    }
    public void setTime(Timestamp time){
        this.instant= time;
    }
    
    
}
