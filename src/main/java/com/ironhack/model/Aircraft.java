package com.ironhack.model;

import jakarta.persistence.*;


@Entity
public class Aircraft {
    @Id
    private String model;
    @Column(name = "total_seats")
    private Integer seats;

    public Aircraft() {
    }

    public Aircraft(String model, Integer seats) {
        this.model = model;
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aircraft aircraft)) return false;

        if (getModel() != null ? !getModel().equals(aircraft.getModel()) : aircraft.getModel() != null) return false;
        return getSeats() != null ? getSeats().equals(aircraft.getSeats()) : aircraft.getSeats() == null;
    }

    @Override
    public int hashCode() {
        int result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + (getSeats() != null ? getSeats().hashCode() : 0);
        return result;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
