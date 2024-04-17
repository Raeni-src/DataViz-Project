package com.weather.spring.weatherspring.controller;
import com.weather.spring.weatherspring.model.weather_conditions_data;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.weather.spring.weatherspring.repository.weather_condition_repo;

@RestController 
@RequestMapping(value="/weather_conditions_data")

public class weather_conditions_controller {
    @Autowired
    weather_condition_repo weather_condition_repo;

    @PostMapping("/add")
    weather_conditions_data addWeather_conditions_data(@RequestBody weather_conditions_data weather_conditions_data ){
        //jpa repository methods for crud operations
            weather_condition_repo.save(weather_conditions_data);
         return weather_conditions_data;
  }
  //To read all the towns in the database
    @GetMapping("/getAll")
    List<weather_conditions_data> getWeather_conditions_data() {
        List<weather_conditions_data> weather_conditions_data= weather_condition_repo.findAll();
        return weather_conditions_data;
    }










}
