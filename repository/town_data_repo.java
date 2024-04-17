package com.weather.spring.weatherspring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.weather.spring.weatherspring.model.town_data;

public interface town_data_repo extends JpaRepository<town_data, Integer>{
    
}
