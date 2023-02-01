package com.ironhack.model;

import com.ironhack.repositories.FlightRepository;
import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "customer_name")
    private  String name;
    @Column(name = "customer_status")
    @Enumerated(EnumType.STRING)
    CustomerStatus status;

    public Customer() {
    }

    public Customer(String name, CustomerStatus status) {
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }
}
