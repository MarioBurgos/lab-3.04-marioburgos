package com.ironhack.repositories;

import com.ironhack.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, String >{
}
