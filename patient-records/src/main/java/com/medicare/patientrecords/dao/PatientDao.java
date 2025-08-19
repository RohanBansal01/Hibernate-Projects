package com.medicare.patientrecords.dao;

import com.medicare.patientrecords.entity.Patient;

import javax.persistence.*;
import java.util.List;

public class PatientDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PatientDao() {
        emf = Persistence.createEntityManagerFactory("medicarePU");
        em = emf.createEntityManager();
    }

    // CREATE
    public void addPatient(Patient patient) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(patient);
        et.commit();
        System.out.println("Patient added: " + patient.getName());
    }

    // READ by ID
    public Patient getPatientById(int id) {
        return em.find(Patient.class, id);
    }

    // READ all
    public List<Patient> getAllPatients() {
        return em.createQuery("SELECT p FROM Patient p", Patient.class).getResultList();
    }

    // UPDATE
    public void updatePatient(Patient patient) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(patient);
        et.commit();
        System.out.println("Patient updated: " + patient.getName());
    }

    // DELETE
    public void deletePatient(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Patient p = em.find(Patient.class, id);
        if (p != null) {
            em.remove(p);
            System.out.println("Deleted Patient with ID: " + id);
        }
        et.commit();
    }

    // Close resources
    public void close() {
        em.close();
        emf.close();
    }
}
