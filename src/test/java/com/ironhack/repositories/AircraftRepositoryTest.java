package com.ironhack.repositories;

import com.ironhack.model.Aircraft;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AircraftRepositoryTest {
    @Autowired
    private AircraftRepository aircraftRepository;
    private Aircraft aircraftX, aircraftY,aircraftZ;

    @BeforeEach
    void setUp() {
        // Creating new Aircraft
        aircraftX = new Aircraft("AC-X", 100);
        aircraftY = new Aircraft("AC-Y", 200);
        aircraftZ = new Aircraft("Boeing", 500);
        //create new Aircraft
        aircraftRepository.save(aircraftX);
        aircraftRepository.save(aircraftY);
        aircraftRepository.save(aircraftZ);
    }

    @AfterEach
    void tearDown() {
        aircraftRepository.deleteAll();
    }

    @Test
    void justForJPAMethods(){
        //findAll()
        List<Aircraft> aircraftList = aircraftRepository.findAll();
        assertEquals(3, aircraftList.size());
        //findById()
        Optional<Aircraft> optionalAircraft = aircraftRepository.findById(aircraftZ.getModel());
        assertTrue(optionalAircraft.isPresent());
        assertEquals(aircraftZ, optionalAircraft.get());
    }

    @Test
    void findByNameLike_NameLikeBoeing_AircraftFound() {
        assertEquals(1, aircraftRepository.findByModelLike("Boeing").size());
        assertEquals(aircraftZ, aircraftRepository.findByModelLike("Boeing").get(0));
    }
}