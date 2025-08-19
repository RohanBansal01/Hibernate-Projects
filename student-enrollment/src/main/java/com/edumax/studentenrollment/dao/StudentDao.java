package com.edumax.studentenrollment.dao;

import com.edumax.studentenrollment.entity.Student;

import javax.persistence.*;
import java.util.List;

public class StudentDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public StudentDao() {
        emf = Persistence.createEntityManagerFactory("edumaxPU");
        em = emf.createEntityManager();
    }

    // CREATE
    public void addStudent(Student student) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(student);
        et.commit();
        System.out.println("Student added: " + student.getName());
    }

    // READ by ID
    public Student getStudentById(int id) {
        return em.find(Student.class, id);
    }

    // READ all
    public List<Student> getAllStudents() {
        return em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    // UPDATE
    public void updateStudent(Student student) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(student);
        et.commit();
        System.out.println("Student updated: " + student.getName());
    }

    // DELETE
    public void deleteStudent(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Student s = em.find(Student.class, id);
        if (s != null) {
            em.remove(s);
            System.out.println("Deleted Student with ID: " + id);
        }
        et.commit();
    }

    // Close resources
    public void close() {
        em.close();
        emf.close();
    }
}
