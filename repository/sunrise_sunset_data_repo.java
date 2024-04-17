package com.weather.spring.weatherspring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.weather.spring.weatherspring.model.sunrise_sunset_data;

public interface sunrise_sunset_data_repo extends JpaRepository<sunrise_sunset_data, Integer>{
    
}
