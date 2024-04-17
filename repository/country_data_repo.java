package com.weather.spring.weatherspring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.weather.spring.weatherspring.model.country_data;


public interface country_data_repo extends JpaRepository<country_data, Integer> {

    
}
