package com.ironhack.repositories;

import com.ironhack.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, String >{

    List<Flight> findByNumber(String number);
    List<Flight> findByMileageGreaterThan(Long mileage);
}
