package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // 1. Create products
        Product p1 = new Product("P001", "Laptop", 10, 999.99);
        Product p2 = new Product("P002", "Smartphone", 25, 499.99);
        Product p3 = new Product("P003", "Wireless Headphones", 50, 89.99);

        // 2. Add products
        System.out.println("--- Adding Products ---");
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        // Display inventory
        inventory.displayInventory();

        // 3. Update products
        System.out.println("\n--- Updating Product P002 ---");
        inventory.updateProduct("P002", 30, 479.99);
        inventory.displayInventory();

        // 4. Delete product
        System.out.println("\n--- Deleting Product P003 ---");
        inventory.deleteProduct("P003");
        inventory.displayInventory();

        // Try to update deleted product
        System.out.println("\n--- Updating Non-Existent Product P003 ---");
        inventory.updateProduct("P003", 10, 79.99);
    }
}
