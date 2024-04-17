package com.weather.spring.weatherspring.controller;
import com.weather.spring.weatherspring.model.country_data;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.weather.spring.weatherspring.repository.country_data_repo;


@RestController 
@RequestMapping(value="/country_data")

public class country_data_controller {
    //accessing the jparepository, we have to autowire
    @Autowired
    country_data_repo country_data_repo;
//
   @PostMapping("/add")
   country_data addCountry_data(@RequestBody country_data country_data ){
       //jpa repository methods for crud operations
           country_data_repo.save(country_data);
        return country_data;
 }
 //To read all the towns in the database
   @GetMapping("/getAll")
   List<country_data> getCountry_data() {
       List<country_data> country_data= country_data_repo.findAll();
       return country_data;
   }   
}
