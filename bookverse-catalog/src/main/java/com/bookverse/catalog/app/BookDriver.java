package com.bookverse.catalog.app;

import com.bookverse.catalog.dao.BookDao;
import com.bookverse.catalog.entity.Book;

import java.util.List;

public class BookDriver {

    public static void main(String[] args) {

        BookDao dao = new BookDao();

        // CREATE
         dao.addBook(new Book(101, "The Alchemist", "Paulo Coelho", 299.99, "Fiction"));

        // READ by ID
        Book book = dao.getBookById(101);
        if (book != null) {
            System.out.println("Found Book: " + book.getTitle() + " by " + book.getAuthor() + " | Price: " + book.getPrice());
        } else {
            System.out.println("No book found with given ID");
        }

        // UPDATE
        if (book != null) {
            book.setPrice(349.99);
            dao.updateBook(book);
        }

        // READ all
        List<Book> books = dao.getAllBooks();
        System.out.println("\nAll Books in DB:");
        for (Book b : books) {
            System.out.println(b.getBookId() + " | " + b.getTitle() + " | " + b.getAuthor() + " | " + b.getPrice() + " | " + b.getGenre());
        }

        // DELETE
        // dao.deleteBook(101);

        dao.close();
    }
}
