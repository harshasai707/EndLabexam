package com.klef.jfsd.exam;

import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck() {}

    public Truck(String name, String type, int maxSpeed, String color, int loadCapacity) {
        super(name, type, maxSpeed, color);
        this.loadCapacity = loadCapacity;
    }

    // Getters and Setters
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
