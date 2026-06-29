package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring XML application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");
        
        // Execute the service method, which should call the injected repository
        bookService.manageBooks();
        
        System.out.println("Exercise 2 Spring dependency injection configured and tested successfully!");
    }
}
