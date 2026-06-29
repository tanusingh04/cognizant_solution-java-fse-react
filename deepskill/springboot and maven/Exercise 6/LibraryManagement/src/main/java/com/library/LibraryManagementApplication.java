package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring XML application context (which performs component scanning)
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean (which is bean-named "bookService" by default)
        BookService bookService = (BookService) context.getBean("bookService");
        
        // Execute the service method to verify the annotation setup
        bookService.manageBooks();
        
        System.out.println("Exercise 6 Spring annotation-based configuration tested successfully!");
    }
}
