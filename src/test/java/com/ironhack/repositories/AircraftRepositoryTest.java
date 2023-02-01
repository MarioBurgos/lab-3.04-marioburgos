package com.ironhack.repositories;

import com.ironhack.model.Aircraft;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AircraftRepositoryTest {
    @Autowired
    private AircraftRepository aircraftRepository;
    private Aircraft aircraftX, aircraftY,aircraftZ;

    @BeforeEach
    void setUp() {
        aircraftX = new Aircraft("AC-X", 100);
        aircraftY = new Aircraft("AC-Y", 200);
        aircraftZ = new Aircraft("AC-Z", null);
        aircraftRepository.save(aircraftX);
        aircraftRepository.save(aircraftY);
        aircraftRepository.save(aircraftZ);
    }

    @AfterEach
    void tearDown() {
        aircraftRepository.deleteAll();
    }
}