package com.ironhack.model;

import jakarta.persistence.*;


@Entity
public class Flight {
    @Id()
    @Column(name = "flight_number")
    private String number;
    private Long mileage;
    @Column(name = "aircraft_model")
    private String aircraft;

    public Flight() {
    }

    public Flight(String number, Long mileage, String aircraft) {
        this.number = number;
        this.mileage = mileage;
        this.aircraft = aircraft;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }
}
