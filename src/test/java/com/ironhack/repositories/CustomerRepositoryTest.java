package com.ironhack.repositories;

import com.ironhack.model.Customer;
import com.ironhack.model.CustomerStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;
    private Customer customerX, customerY, customerZ;
    @BeforeEach
    void setUp() {
        customerX = new Customer("CustomerX", CustomerStatus.NONE);
        customerY = new Customer("CustomerY", CustomerStatus.SILVER);
        customerZ = new Customer("CustomerZ", CustomerStatus.GOLD);
        customerRepository.save(customerX);
        customerRepository.save(customerY);
        customerRepository.save(customerZ);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void findByName_ValidName_CustomerFound(){
        List<Customer> found = customerRepository.findByName("CustomerX");
        assertEquals(1, found.size());
        assertEquals(customerX, found.get(0));
    }
    @Test
    void findByStatus_ValidStatus_CustomerFound(){
        List<Customer> found = customerRepository.findByStatus(CustomerStatus.NONE);
        assertEquals(1, found.size());
        assertEquals(customerX, found.get(0));

        found = customerRepository.findByStatus(CustomerStatus.SILVER);
        assertEquals(1, found.size());
        assertEquals(customerY, found.get(0));

        found = customerRepository.findByStatus(CustomerStatus.GOLD);
        assertEquals(1, found.size());
        assertEquals(customerZ, found.get(0));
    }
}