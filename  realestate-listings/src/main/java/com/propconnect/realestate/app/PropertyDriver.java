package com.propconnect.realestate.app;

import com.propconnect.realestate.dao.PropertyDao;
import com.propconnect.realestate.entity.Property;

import java.util.List;

public class PropertyDriver {

    public static void main(String[] args) {

        PropertyDao dao = new PropertyDao();

        // CREATE
         dao.addProperty(new Property(null, "Luxury Villa", "Beverly Hills", 2500000.0, "Villa"));

        // READ by ID
        Property p = dao.getPropertyById(1);
        if (p != null) {
            System.out.println("Found Property: " + p.getTitle() + " | Location: " + p.getLocation() + " | Price: " + p.getPrice() + " | Type: " + p.getPropertyType());
        } else {
            System.out.println("No property found with given ID");
        }

        // UPDATE
        if (p != null) {
            p.setPrice(2600000.0);
            dao.updateProperty(p);
        }

        // READ all
        List<Property> list = dao.getAllProperties();
        System.out.println("\nAll Properties in DB:");
        for (Property property : list) {
            System.out.println(property.getPropertyId() + " | " + property.getTitle() + " | " + property.getLocation() + " | " + property.getPrice() + " | " + property.getPropertyType());
        }

        // DELETE
        // dao.deleteProperty(1);

        dao.close();
    }
}
