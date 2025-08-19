package com.workmate.employeemanagement.dao;

import com.workmate.employeemanagement.entity.Employee;

import javax.persistence.*;
import java.util.List;

public class EmployeeDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public EmployeeDao() {
        emf = Persistence.createEntityManagerFactory("workmatePU");
        em = emf.createEntityManager();
    }

    // CREATE
    public void addEmployee(Employee employee) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(employee);
        et.commit();
        System.out.println("Employee added: " + employee.getName());
    }

    // READ by ID
    public Employee getEmployeeById(int id) {
        return em.find(Employee.class, id);
    }

    // READ all
    public List<Employee> getAllEmployees() {
        return em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
    }

    // UPDATE
    public void updateEmployee(Employee employee) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(employee);
        et.commit();
        System.out.println("Employee updated: " + employee.getName());
    }

    // DELETE
    public void deleteEmployee(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Employee e = em.find(Employee.class, id);
        if (e != null) {
            em.remove(e);
            System.out.println("Deleted Employee with ID: " + id);
        }
        et.commit();
    }

    // Close resources
    public void close() {
        em.close();
        emf.close();
    }
}
