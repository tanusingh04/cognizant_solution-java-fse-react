package com.library;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
        System.out.println("Exercise 9 Spring Boot application started successfully!");
    }

    @Bean
    public CommandLineRunner initData(BookRepository bookRepository) {
        return args -> {
            System.out.println("Initializing sample data in H2 database...");
            bookRepository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
            bookRepository.save(new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789"));
            bookRepository.save(new Book("1984", "George Orwell", "9780451524935"));
            System.out.println("Sample books initialized successfully!");
        };
    }
}
