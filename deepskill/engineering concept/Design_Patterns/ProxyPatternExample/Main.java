package ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Proxy Pattern ===");

        // Create proxies for two remote images
        Image image1 = new ProxyImage("high_res_photo_1.jpg");
        Image image2 = new ProxyImage("high_res_photo_2.jpg");

        System.out.println("\nProxies created. Notice that no network loading has happened yet.");

        // First display of image1 - will trigger loading from server
        System.out.println("\n--- Displaying Image 1 (First Time) ---");
        long startTime = System.currentTimeMillis();
        image1.display();
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");

        // Second display of image1 - should be instant (cached)
        System.out.println("\n--- Displaying Image 1 (Second Time - Cached) ---");
        startTime = System.currentTimeMillis();
        image1.display();
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");

        // Display image 2 - will trigger loading from server
        System.out.println("\n--- Displaying Image 2 (First Time) ---");
        startTime = System.currentTimeMillis();
        image2.display();
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
