package com.weather.spring.weatherspring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.weather.spring.weatherspring.model.precipitation_data;


public interface precipitation_data_repo extends JpaRepository<precipitation_data, Integer> {
    
}
