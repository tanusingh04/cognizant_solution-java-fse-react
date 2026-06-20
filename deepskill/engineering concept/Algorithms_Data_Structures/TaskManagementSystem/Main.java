package TaskManagementSystem;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // 1. Create tasks
        Task t1 = new Task("T001", "Design Database Schema", "In Progress");
        Task t2 = new Task("T002", "Implement Authentication", "Pending");
        Task t3 = new Task("T003", "Write Unit Tests", "Pending");
        Task t4 = new Task("T004", "Setup CI/CD Pipeline", "Completed");

        // 2. Add tasks
        System.out.println("=== Testing Add Task ===");
        list.addTask(t1);
        list.addTask(t2);
        list.addTask(t3);
        list.addTask(t4);

        // 3. Traverse
        list.traverseTasks();

        // 4. Search
        System.out.println("\n=== Testing Search Task ===");
        String searchId = "T003";
        Task found = list.searchTask(searchId);
        System.out.println("Search for ID " + searchId + ": " + (found != null ? found : "Not Found"));

        // 5. Delete middle task
        System.out.println("\n=== Testing Delete Task (Middle) ===");
        list.deleteTask("T002");
        list.traverseTasks();

        // 6. Delete head task
        System.out.println("\n=== Testing Delete Task (Head) ===");
        list.deleteTask("T001");
        list.traverseTasks();

        // 7. Delete non-existent
        System.out.println("\n=== Testing Delete Non-Existent Task ===");
        list.deleteTask("T099");
    }
}
