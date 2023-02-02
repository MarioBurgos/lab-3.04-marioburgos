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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight flight)) return false;

        if (getNumber() != null ? !getNumber().equals(flight.getNumber()) : flight.getNumber() != null) return false;
        if (getMileage() != null ? !getMileage().equals(flight.getMileage()) : flight.getMileage() != null)
            return false;
        return getAircraft() != null ? getAircraft().equals(flight.getAircraft()) : flight.getAircraft() == null;
    }

    @Override
    public int hashCode() {
        int result = getNumber() != null ? getNumber().hashCode() : 0;
        result = 31 * result + (getMileage() != null ? getMileage().hashCode() : 0);
        result = 31 * result + (getAircraft() != null ? getAircraft().hashCode() : 0);
        return result;
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
