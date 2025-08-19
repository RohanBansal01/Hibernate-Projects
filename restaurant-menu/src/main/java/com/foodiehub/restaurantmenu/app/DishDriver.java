package com.foodiehub.restaurantmenu.app;

import com.foodiehub.restaurantmenu.dao.DishDao;
import com.foodiehub.restaurantmenu.entity.Dish;

import java.util.List;

public class DishDriver {

    public static void main(String[] args) {

        DishDao dao = new DishDao();

        // CREATE
         dao.addDish(new Dish(null, "Margherita Pizza", "Main Course", 299.99, true));

        // READ by ID
        Dish dish = dao.getDishById(1);
        if (dish != null) {
            System.out.println("Found Dish: " + dish.getName() + " | Category: " + dish.getCategory() + " | Price: " + dish.getPrice() + " | Available: " + dish.isAvailability());
        } else {
            System.out.println("No dish found with given ID");
        }

        // UPDATE
        if (dish != null) {
            dish.setPrice(279.99);
            dish.setAvailability(false);
            dao.updateDish(dish);
        }

        // READ all
        List<Dish> dishes = dao.getAllDishes();
        System.out.println("\nAll Dishes in DB:");
        for (Dish d : dishes) {
            System.out.println(d.getDishId() + " | " + d.getName() + " | " + d.getCategory() + " | " + d.getPrice() + " | " + d.isAvailability());
        }

        // DELETE
        // dao.deleteDish(1);

        dao.close();
    }
}
