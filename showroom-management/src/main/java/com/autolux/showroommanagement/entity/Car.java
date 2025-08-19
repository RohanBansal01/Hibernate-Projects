package com.autolux.showroommanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "car_table")
public class Car {

    @Id
    private int carId;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "price")
    private double price;

    @Column(name = "fuel_type")
    private String fuelType;

    public Car() {
    }

    public Car(int carId, String brand, String model, double price, String fuelType) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
    }

    // Getters and setters

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
