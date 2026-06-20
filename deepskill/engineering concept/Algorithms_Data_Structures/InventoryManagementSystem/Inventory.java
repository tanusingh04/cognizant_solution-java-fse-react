package InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    // Add a product
    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists. Use update instead.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product added successfully: " + product.getProductName());
        }
    }

    // Update a product
    public void updateProduct(String productId, int newQuantity, double newPrice) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product updated successfully: " + product.getProductName());
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            Product removedProduct = products.remove(productId);
            System.out.println("Product deleted successfully: " + removedProduct.getProductName());
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    // Get a product
    public Product getProduct(String productId) {
        return products.get(productId);
    }

    // Display all products
    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\nCurrent Inventory:");
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
    }
}
