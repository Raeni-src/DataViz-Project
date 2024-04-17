package com.weather.spring.weatherspring.controller;
import com.weather.spring.weatherspring.model.temperature_data;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.weather.spring.weatherspring.repository.temperature_data_repo;


@RestController 
@RequestMapping(value="/temperature_data")
public class temperature_data_controller {
    //accessing the jparepository, we have to autowire
    @Autowired
    temperature_data_repo temperature_data_repo;
//
   @PostMapping("/add")
   temperature_data addtemperature_data(@RequestBody temperature_data temperature_data ){
       //jpa repository methods for crud operations
           temperature_data_repo.save(temperature_data);
        return temperature_data;
 }
 //To read all the towns in the database
   @GetMapping("/getAll")
   List<temperature_data> gettemperature_data() {
       List<temperature_data> temperature_data= temperature_data_repo.findAll();
       return temperature_data;
   }   
}
