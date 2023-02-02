package com.ironhack.repositories;

import com.ironhack.model.Customer;
import com.ironhack.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByName(String name);
    List<Customer> findByStatus(CustomerStatus status);
}
