package com.autolux.showroommanagement.dao;

import com.autolux.showroommanagement.entity.Car;

import javax.persistence.*;
import java.util.List;

public class CarDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public CarDao() {
        emf = Persistence.createEntityManagerFactory("autoluxPU");
        em = emf.createEntityManager();
    }

    // CREATE
    public void addCar(Car car) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(car);
        et.commit();
        System.out.println("Car added: " + car.getBrand() + " " + car.getModel());
    }

    // READ by ID
    public Car getCarById(int id) {
        return em.find(Car.class, id);
    }

    // READ all
    public List<Car> getAllCars() {
        return em.createQuery("SELECT c FROM Car c", Car.class).getResultList();
    }

    // UPDATE
    public void updateCar(Car car) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(car);
        et.commit();
        System.out.println("Car updated: " + car.getBrand() + " " + car.getModel());
    }

    // DELETE
    public void deleteCar(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Car c = em.find(Car.class, id);
        if (c != null) {
            em.remove(c);
            System.out.println("Deleted Car with ID: " + id);
        }
        et.commit();
    }

    // Close resources
    public void close() {
        em.close();
        emf.close();
    }
}
