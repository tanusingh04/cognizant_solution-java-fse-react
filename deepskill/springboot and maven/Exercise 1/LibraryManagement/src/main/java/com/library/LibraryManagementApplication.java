package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.repository.BookRepository;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring XML application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookRepository bean
        BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
        bookRepository.getBooks();

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.manageBooks();
        
        System.out.println("Exercise 1 Basic Spring application configured successfully!");
    }
}
