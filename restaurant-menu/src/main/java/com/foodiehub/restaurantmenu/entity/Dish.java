package com.foodiehub.restaurantmenu.entity;

import javax.persistence.*;

@Entity
@Table(name = "dish_table")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dishId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    private double price;

    private boolean availability;

    public Dish() {
    }

    public Dish(Integer dishId, String name, String category, double price, boolean availability) {
        this.dishId = dishId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.availability = availability;
    }

    // Getters and Setters

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
