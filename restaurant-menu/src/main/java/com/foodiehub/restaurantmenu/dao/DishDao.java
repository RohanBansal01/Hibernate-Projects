package com.foodiehub.restaurantmenu.dao;

import com.foodiehub.restaurantmenu.entity.Dish;

import javax.persistence.*;
import java.util.List;

public class DishDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public DishDao() {
        emf = Persistence.createEntityManagerFactory("foodiehubPU");
        em = emf.createEntityManager();
    }

    // CREATE
    public void addDish(Dish dish) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(dish);
        et.commit();
        System.out.println("Dish added: " + dish.getName());
    }

    // READ by ID
    public Dish getDishById(int id) {
        return em.find(Dish.class, id);
    }

    // READ all
    public List<Dish> getAllDishes() {
        return em.createQuery("SELECT d FROM Dish d", Dish.class).getResultList();
    }

    // UPDATE
    public void updateDish(Dish dish) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(dish);
        et.commit();
        System.out.println("Dish updated: " + dish.getName());
    }

    // DELETE
    public void deleteDish(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Dish dish = em.find(Dish.class, id);
        if (dish != null) {
            em.remove(dish);
            System.out.println("Deleted Dish with ID: " + id);
        }
        et.commit();
    }

    // Close resources
    public void close() {
        em.close();
        emf.close();
    }
}
