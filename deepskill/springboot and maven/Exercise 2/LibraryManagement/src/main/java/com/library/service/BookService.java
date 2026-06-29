package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageBooks() {
        System.out.println("BookService: Managing books...");
        if (bookRepository != null) {
            bookRepository.getBooks();
        } else {
            System.out.println("BookService: Warning! bookRepository is null!");
        }
    }
}
