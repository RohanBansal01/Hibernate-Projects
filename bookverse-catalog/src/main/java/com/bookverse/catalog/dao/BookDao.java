package com.bookverse.catalog.dao;

import com.bookverse.catalog.entity.Book;

import javax.persistence.*;
import java.util.List;

public class BookDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public BookDao() {
        emf = Persistence.createEntityManagerFactory("rohan");
        em = emf.createEntityManager();
    }

    // CREATE
    public void addBook(Book book) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(book);
        et.commit();
        System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
    }

    // READ by ID
    public Book getBookById(int id) {
        return em.find(Book.class, id);
    }

    // READ all
    public List<Book> getAllBooks() {
        return em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }

    // UPDATE
    public void updateBook(Book book) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(book);
        et.commit();
        System.out.println("Book updated: " + book.getTitle() + " by " + book.getAuthor());
    }

    // DELETE
    public void deleteBook(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Book book = em.find(Book.class, id);
        if (book != null) {
            em.remove(book);
            System.out.println("Deleted Book with ID: " + id);
        }
        et.commit();
    }

    // Close resources
    public void close() {
        em.close();
        emf.close();
    }
}
