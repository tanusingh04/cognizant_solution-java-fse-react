package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring XML application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve and test BookService configured via Constructor Injection
        System.out.println("--- Testing Constructor Injection ---");
        BookService serviceConstructor = (BookService) context.getBean("bookServiceConstructor");
        serviceConstructor.manageBooks();

        // Retrieve and test BookService configured via Setter Injection
        System.out.println("--- Testing Setter Injection ---");
        BookService serviceSetter = (BookService) context.getBean("bookServiceSetter");
        serviceSetter.manageBooks();
        
        System.out.println("Exercise 7 Constructor and Setter injection verified successfully!");
    }
}
