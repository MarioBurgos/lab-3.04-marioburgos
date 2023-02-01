package com.ironhack.repositories;

import com.ironhack.model.Aircraft;
import com.ironhack.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;
    private Flight flightX, flightY, flightZ;
    @BeforeEach
    void setUp() {
        flightX = new Flight("FLY-X", null, "null");
        flightY = new Flight("FLY-Y", null, "null");
        flightZ = new Flight("FLY-Z", null, "null");
    }

    @AfterEach
    void tearDown() {
        flightRepository.deleteAll();
    }
}