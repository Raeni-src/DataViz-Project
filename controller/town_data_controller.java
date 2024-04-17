package com.weather.spring.weatherspring.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.weather.spring.weatherspring.model.town_data;
import com.weather.spring.weatherspring.repository.town_data_repo;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping( value= "/town")
public class town_data_controller {

//accessing the jparepository, we have to autowire
     @Autowired
     town_data_repo town_data_Repo;
//
    @PostMapping("/add")
    town_data addTown_data(@RequestBody town_data town_data ){
        //jpa repository methods for crud operations
            town_data_Repo.save(town_data);
         return town_data;
  }
  //To read all the towns in the database
    @GetMapping("/getAll")
    List<town_data> getTown_data() {
        List<town_data> town_data= town_data_Repo.findAll();
        return town_data;
    }
    
}
