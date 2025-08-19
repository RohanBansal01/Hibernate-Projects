package com.bookverse.catalog.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_table")
public class Book {

    @Id
    private int bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "price")
    private double price;

    @Column(name = "genre")
    private String genre;

    public Book() {
    }

    public Book(int bookId, String title, String author, double price, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    // Getters and setters

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
