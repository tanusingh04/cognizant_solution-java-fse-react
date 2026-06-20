package LibraryManagementSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B003", "1984", "George Orwell"),
            new Book("B004", "Moby Dick", "Herman Melville"),
            new Book("B005", "Brave New World", "Aldous Huxley")
        };

        // Sort the array by title for Binary Search
        Arrays.sort(books);

        System.out.println("=== Sorted Library Books ===");
        for (Book book : books) {
            System.out.println(book);
        }

        // Target book to find
        String targetTitle = "Moby Dick";

        // Test Linear Search
        System.out.println("\n--- Testing Linear Search ---");
        Book foundLinear = Library.linearSearchByTitle(books, targetTitle);
        System.out.println("Found: " + (foundLinear != null ? foundLinear : "Not Found"));

        // Test Binary Search
        System.out.println("\n--- Testing Binary Search ---");
        Book foundBinary = Library.binarySearchByTitle(books, targetTitle);
        System.out.println("Found: " + (foundBinary != null ? foundBinary : "Not Found"));

        // Test Non-existent book
        String missingTitle = "Hamlet";
        System.out.println("\n--- Testing Search for Non-Existent Book '" + missingTitle + "' ---");
        System.out.println("Linear Search result: " + Library.linearSearchByTitle(books, missingTitle));
        System.out.println("Binary Search result: " + Library.binarySearchByTitle(books, missingTitle));
    }
}
