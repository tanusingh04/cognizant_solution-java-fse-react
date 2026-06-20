package SortingOrders;

public class Main {
    public static void main(String[] args) {
        Order[] ordersForBubble = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 120.00),
            new Order("O003", "Charlie", 450.00),
            new Order("O004", "David", 95.99),
            new Order("O005", "Emma", 320.00)
        };

        Order[] ordersForQuick = ordersForBubble.clone();

        System.out.println("=== Original Orders ===");
        printOrders(ordersForBubble);

        // Test Bubble Sort
        System.out.println("\n--- Sorting using Bubble Sort ---");
        SortingAlgorithms.bubbleSort(ordersForBubble);
        printOrders(ordersForBubble);

        // Test Quick Sort
        System.out.println("\n--- Sorting using Quick Sort ---");
        SortingAlgorithms.quickSort(ordersForQuick, 0, ordersForQuick.length - 1);
        printOrders(ordersForQuick);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
