package com.ironhack.repositories;

import com.ironhack.model.Aircraft;
import com.ironhack.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;
    private Flight flightX, flightY, flightZ;
    @BeforeEach
    void setUp() {
        flightX = new Flight("FLY-X", Long.valueOf(500), "null");
        flightY = new Flight("FLY-Y", Long.valueOf(1000), "null");
        flightZ = new Flight("FLY-Z", Long.valueOf(2000), "null");
        flightRepository.save(flightX);
        flightRepository.save(flightY);
        flightRepository.save(flightZ);
    }

    @AfterEach
    void tearDown() {
        flightRepository.deleteAll();
    }

    @Test
    void findByNumber_ValidNumber_FlightFound() {
        List<Flight> found = flightRepository.findByNumber(flightX.getNumber());
        assertEquals(1, found.size());
        assertEquals(flightX, found.get(0));

    }

    @Test
    void findByMileageGreaterThan_ValidMileage_FlightFound() {
        List<Flight> found = flightRepository.findByMileageGreaterThan(Long.valueOf(500));
        assertEquals(2, found.size());
        assertEquals(flightY, found.get(0));
        assertEquals(flightZ, found.get(1));

    }
}