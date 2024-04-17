package com.weather.spring.weatherspring.controller;
import com.weather.spring.weatherspring.model.sunrise_sunset_data;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.weather.spring.weatherspring.repository.sunrise_sunset_data_repo;


@RestController 
@RequestMapping(value="/sunrise_sunset_data")
public class sunrise_sunset_data_controller {
     //accessing the jparepository, we have to autowire
     @Autowired
     sunrise_sunset_data_repo sunrise_sunset_data_repo;
 //
    @PostMapping("/add")
    sunrise_sunset_data addsunrise_sunset_data(@RequestBody sunrise_sunset_data sunrise_sunset_data ){
        //jpa repository methods for crud operations
            sunrise_sunset_data_repo.save(sunrise_sunset_data);
         return sunrise_sunset_data;
  }
  //To read all the towns in the database
    @GetMapping("/getAll")
    List<sunrise_sunset_data> getsunrise_sunset_data() {
        List<sunrise_sunset_data> sunrise_sunset_data= sunrise_sunset_data_repo.findAll();
        return sunrise_sunset_data;
    }   
}
