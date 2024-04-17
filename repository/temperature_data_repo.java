package com.weather.spring.weatherspring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.weather.spring.weatherspring.model.temperature_data;


public interface temperature_data_repo extends JpaRepository<temperature_data, Integer> {
    
}
