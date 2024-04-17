package com.weather.spring.weatherspring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.weather.spring.weatherspring.model.humidity_data;


public interface humidity_data_repo extends JpaRepository<humidity_data, Integer> {
    
}
