package com.ironhack.model;

import com.ironhack.repositories.FlightRepository;
import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    @Enumerated(EnumType.STRING)
    FlightRepository status;

    public Customer() {
    }

    public Customer(String name, FlightRepository status) {
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

    public FlightRepository getStatus() {
        return status;
    }

    public void setStatus(FlightRepository status) {
        this.status = status;
    }
}
