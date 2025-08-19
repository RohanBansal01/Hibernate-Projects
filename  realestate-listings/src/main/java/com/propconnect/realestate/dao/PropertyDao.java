package com.propconnect.realestate.dao;

import com.propconnect.realestate.entity.Property;

import javax.persistence.*;
import java.util.List;

public class PropertyDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PropertyDao() {
        emf = Persistence.createEntityManagerFactory("propconnectPU");
        em = emf.createEntityManager();
    }

    // CREATE
    public void addProperty(Property property) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(property);
        et.commit();
        System.out.println("Property added: " + property.getTitle());
    }

    // READ by ID
    public Property getPropertyById(int id) {
        return em.find(Property.class, id);
    }

    // READ all
    public List<Property> getAllProperties() {
        return em.createQuery("SELECT p FROM Property p", Property.class).getResultList();
    }

    // UPDATE
    public void updateProperty(Property property) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(property);
        et.commit();
        System.out.println("Property updated: " + property.getTitle());
    }

    // DELETE
    public void deleteProperty(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Property p = em.find(Property.class, id);
        if (p != null) {
            em.remove(p);
            System.out.println("Deleted Property with ID: " + id);
        }
        et.commit();
    }

    // Close resources
    public void close() {
        em.close();
        emf.close();
    }
}
