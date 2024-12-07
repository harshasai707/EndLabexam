package com.klef.jfsd.exam;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car() {}

    public Car(String name, String type, int maxSpeed, String color, int numberOfDoors) {
        super(name, type, maxSpeed, color);
        this.numberOfDoors = numberOfDoors;
    }

    // Getters and Setters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
