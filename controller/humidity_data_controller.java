package com.weather.spring.weatherspring.controller;
import com.weather.spring.weatherspring.model.humidity_data;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.weather.spring.weatherspring.repository.humidity_data_repo;


@RestController 
@RequestMapping(value="/humidity_data")
public class humidity_data_controller {
    //accessing the jparepository, we have to autowire
    @Autowired
    humidity_data_repo humidity_data_repo;
//
   @PostMapping("/add")
   humidity_data addhumidity_data(@RequestBody humidity_data humidity_data ){
       //jpa repository methods for crud operations
           humidity_data_repo.save(humidity_data);
        return humidity_data;
 }
 //To read all the towns in the database
   @GetMapping("/getAll")
   List<humidity_data> gethumidity_data() {
       List<humidity_data> humidity_data= humidity_data_repo.findAll();
       return humidity_data;
   }   
}
