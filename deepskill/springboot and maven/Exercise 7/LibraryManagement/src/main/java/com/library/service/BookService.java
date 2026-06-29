package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String injectionType;

    // Default constructor for Setter Injection
    public BookService() {
        this.injectionType = "Setter Injection";
    }

    // Constructor with parameters for Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        this.injectionType = "Constructor Injection";
    }

    // Setter method for Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageBooks() {
        System.out.println("BookService active via: " + injectionType);
        if (bookRepository != null) {
            bookRepository.getBooks();
        } else {
            System.out.println("BookService error: bookRepository is null!");
        }
    }
}
