package com.weather.spring.weatherspring.controller;
import com.weather.spring.weatherspring.model.precipitation_data;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.weather.spring.weatherspring.repository.precipitation_data_repo;


@RestController 
@RequestMapping(value="/precipitation_data")
public class precipitation_data_controller {
    //accessing the jparepository, we have to autowire
    @Autowired
    precipitation_data_repo precipitation_data_repo;
//
   @PostMapping("/add")
   precipitation_data addprecipitation_data(@RequestBody precipitation_data precipitation_data ){
       //jpa repository methods for crud operations
           precipitation_data_repo.save(precipitation_data);
        return precipitation_data;
 }
 //To read all the towns in the database
   @GetMapping("/getAll")
   List<precipitation_data> getprecipitation_data() {
       List<precipitation_data> precipitation_data= precipitation_data_repo.findAll();
       return precipitation_data;
   }   
}
