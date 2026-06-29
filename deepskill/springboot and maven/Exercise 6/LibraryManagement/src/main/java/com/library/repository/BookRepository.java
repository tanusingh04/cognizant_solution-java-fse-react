package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void getBooks() {
        System.out.println("BookRepository (Annotation-based): Fetching books list...");
    }
}
