package com.library.repository;

public class BookRepository {
    private String repoName = "DefaultRepo";

    public BookRepository() {}

    public BookRepository(String repoName) {
        this.repoName = repoName;
    }

    public void getBooks() {
        System.out.println("BookRepository (" + repoName + "): Retrieving books...");
    }
}
