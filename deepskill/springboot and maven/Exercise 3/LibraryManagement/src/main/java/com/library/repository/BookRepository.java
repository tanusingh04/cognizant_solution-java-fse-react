package com.library.repository;

public class BookRepository {
    public void getBooks() {
        System.out.println("BookRepository: Executing getBooks method...");
        try {
            // Simulate short database latency
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
