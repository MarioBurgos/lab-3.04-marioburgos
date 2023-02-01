package com.ironhack.repositories;

import com.ironhack.model.Customer;
import com.ironhack.model.CustomerStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;
    private Customer customerX, customerY, customerZ;
    @BeforeEach
    void setUp() {
        customerX = new Customer("CustomerX", CustomerStatus.NONE);
        customerY = new Customer("CustomerY", CustomerStatus.NONE);
        customerZ = new Customer("CustomerZ", CustomerStatus.NONE);
        customerRepository.save(customerX);
        customerRepository.save(customerY);
        customerRepository.save(customerZ);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }
}