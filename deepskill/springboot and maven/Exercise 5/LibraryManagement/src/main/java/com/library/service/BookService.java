package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for Spring IoC to inject the repository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageBooks() {
        System.out.println("BookService inside IoC Container: Handling book operations...");
        if (bookRepository != null) {
            bookRepository.getBooks();
        } else {
            System.out.println("BookService inside IoC Container: Error! BookRepository is not injected.");
        }
    }
}
