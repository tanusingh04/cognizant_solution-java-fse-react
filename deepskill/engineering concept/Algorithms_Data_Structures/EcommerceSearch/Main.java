package EcommerceSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create an unsorted array of products
        Product[] products = {
            new Product("P105", "Wireless Mouse", "Electronics"),
            new Product("P101", "Gaming Keyboard", "Electronics"),
            new Product("P103", "Noise Cancelling Headphones", "Audio"),
            new Product("P102", "USB-C Hub", "Accessories"),
            new Product("P104", "Mechanical Pencil", "Stationery")
        };

        System.out.println("=== Unsorted Products (for Linear Search) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        // Test Linear Search
        System.out.println("\n--- Testing Linear Search ---");
        String targetId = "P103";
        Product resultLinear = SearchAlgorithms.linearSearch(products, targetId);
        System.out.println("Search for ID '" + targetId + "': " + (resultLinear != null ? resultLinear : "Not Found"));

        // Create a sorted array of products for Binary Search
        Product[] sortedProducts = products.clone();
        Arrays.sort(sortedProducts);

        System.out.println("\n=== Sorted Products (for Binary Search) ===");
        for (Product p : sortedProducts) {
            System.out.println(p);
        }

        // Test Binary Search
        System.out.println("\n--- Testing Binary Search ---");
        Product resultBinary = SearchAlgorithms.binarySearch(sortedProducts, targetId);
        System.out.println("Search for ID '" + targetId + "': " + (resultBinary != null ? resultBinary : "Not Found"));

        // Test Non-Existent Product
        String missingId = "P999";
        System.out.println("\n--- Testing Non-Existent Product ID '" + missingId + "' ---");
        System.out.println("Linear Search: " + SearchAlgorithms.linearSearch(products, missingId));
        System.out.println("Binary Search: " + SearchAlgorithms.binarySearch(sortedProducts, missingId));
    }
}
