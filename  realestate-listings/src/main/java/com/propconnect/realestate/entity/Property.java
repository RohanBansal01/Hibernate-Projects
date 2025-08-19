package com.propconnect.realestate.entity;

import javax.persistence.*;

@Entity
@Table(name = "property_table")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer propertyId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String location;

    private double price;

    @Column(nullable = false)
    private String propertyType;

    public Property() {
    }

    public Property(Integer propertyId, String title, String location, double price, String propertyType) {
        this.propertyId = propertyId;
        this.title = title;
        this.location = location;
        this.price = price;
        this.propertyType = propertyType;
    }

    // Getters and Setters

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}
