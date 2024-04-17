package com.weather.spring.weatherspring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.weather.spring.weatherspring.model.weather_conditions_data;



public interface weather_condition_repo extends JpaRepository<weather_conditions_data, Integer>{
    
}
